package web2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import web2.dto.MemberDTO;
import static web2.dao.JdbcUtil.*;

// ~DAO : DB 작업(CRUD)을 모아놓은 클래스

public class MemberDAO {
	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//전체 조회
	//Read : select * from member; => List<MemberDTO> (결과가 여러 개일 경우 무조건 리스트로)
	//	   : select * from member where id=1; => MemberDTO (결과가 하나여서)
	//	   : select * from member where name='홍길동'; => List<MemberDTO> (결과가 여러 개일 경우 무조건 리스트로)
	
	public List<MemberDTO> getList() {
		List<MemberDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member order by id desc";
		try {
			pstmt = con.prepareStatement(sql); //sql 전송하기
			rs = pstmt.executeQuery(); //select 니까 executeQuery()
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO(); //dto에 담기
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setEmail(rs.getString("email"));
				dto.setAge(rs.getInt("age"));
				
				list.add(dto); //dto에 있는 것들을 리스트 형식인 list 변수에 담기
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list; //값을 돌려줘야 하니까
	}
	
	//Read : select * from member where id=?;
	public MemberDTO getRow(int id) {
		MemberDTO dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member where id=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId(id);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setEmail(rs.getString("email"));
				dto.setAge(rs.getInt("age"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return dto;
	}
	
	
	//삽입
	//Create : insert => 숫자(1-성공, 0-실패)
	public boolean insert(MemberDTO insertDto) {
		
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into member(id,name,addr,email,age)";
		sql += "values(member_seq.nextval,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			// ? 해결
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getAddr());
			pstmt.setString(3, insertDto.getEmail());
			pstmt.setInt(4, insertDto.getAge());
			//실행
			int result = pstmt.executeUpdate(); 
			
			if(result>0) { //성공이라면
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	
	//삭제 : Delete =>  (1-성공, 실패-0)
	//		delete from member where id=?; 
	public boolean delete(int id) { //물음표에 대한 인자값
		boolean flag = false; //성공인지 실패인지 결과 알기 위해
		PreparedStatement pstmt = null;
		String sql = "delete from member where id=?";
		
		try {
			pstmt = con.prepareStatement(sql); //전송
			pstmt.setInt(1, id); //?에 대한 처리
			int result = pstmt.executeUpdate(); //결과
			
			if(result>0) flag = true; //result 가 1이면 성공
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt); //sql 문 전송하는거 닫기
		}
		return flag; //결과 받을 때 불린 값으로 돌려주기 위해서
	}
	
	
	//수정 - Update => (1-성공, 실패-0)
	//		update member set addr=? where id=?;
	public boolean update(int id, String addr) {
		boolean result = false;
		PreparedStatement pstmt = null;
		String sql = "update member set addr=? where id=?";
		try {
			pstmt = con.prepareStatement(sql); //sql 문 전송하기
			pstmt.setString(1, addr); //물음표 값 처리하기
			pstmt.setInt(2, id); //물음표 값 처리하기
			int cnt = pstmt.executeUpdate(); //실행
			
			if(cnt>0) result = true; //수정 성공하면 true 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt); //sql 문 전송 닫아주기
		}
		
		return result;
	}
	
	
	
	
}








