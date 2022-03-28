package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*; // JdbcUtil.close(rs) ==> close(rs)

// CRUD 담당 객체
public class MemberDAO {

	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
	
	
	// C(insert) 담당 메소드
	public boolean insert(MemberDTO insertDto) {
		String sql = "insert into member(id,name,addr,email,age) values(member_seq.nextval,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			//sql 전송
			pstmt = con.prepareStatement(sql);
			//? 처리			
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getAddr());
			pstmt.setString(3, insertDto.getEmail());
			pstmt.setInt(4, insertDto.getAge());
			//sql 실행
			int result = pstmt.executeUpdate();
			if(result>0) {
				return true;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;		
	}
	
	//R(Read) - select
	//select : 행이 하나만 나오는 경우 - ~DTO
	//         여러개 나오는 경우 - List<~DTO>
	public List<MemberDTO> getList(){
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "select * from member";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//컬럼 하나씩 가져와서 변수에 담기
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				
				list.add(new MemberDTO(id, name, addr, email, age));
				
//				MemberDTO dto = new MemberDTO();
//				dto.setId(rs.getInt("id"));
//				dto.setName(rs.getString("name"));
//				dto.setAddr(rs.getString("addr"));
//				dto.setEmail(rs.getString("email"));
//				dto.setAge(rs.getInt("age"));
//				list.add(dto);
				
				
//				list.add(new MemberDTO(rs.getInt("id"), rs.getString("name"),
//						rs.getString("addr"), rs.getString("email"), rs.getInt("age")));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	//U(update) - 1 : 주소수정, 2 : 이메일 수정
	public boolean updateMember(int no, String input, int id) {
		PreparedStatement pstmt = null;
		String sql = "";
		try {
			
			if(no==1) {
				sql = "update MEMBER set addr=? where id=?";				
			}else {
				sql = "update MEMBER set email=? where id=?";
			}
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, input);
			pstmt.setInt(2, id);	
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;		
	}	
	
	//D(delete)
	public boolean removeMember(int id) {
		PreparedStatement pstmt = null;
		String sql = "delete from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;		
	}
}




























