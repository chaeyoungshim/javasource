package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import book.dto.BookDTO;
import static book.dao.JdbcUtil.*;


public class BookDAO {
	private Connection con;

	public BookDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	public boolean insert(BookDTO dto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into bookTBL values(?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCode());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getWriter());
			pstmt.setInt(4, dto.getPrice());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
		
		return flag;
	}
	
	
	// 전체 조회
	public List<BookDTO> getlist() {
		List<BookDTO> list = new ArrayList<>(); //전체 조회이기 때문에 배열로
		PreparedStatement pstmt = null;
		ResultSet rs = null; //조회니까 필요함
		String sql = "select * from bookTBL";
		try {
			pstmt = con.prepareStatement(sql); //sql문 전송하기
			rs = pstmt.executeQuery(); 
			while(rs.next()) {
				BookDTO dto = new BookDTO(); //객체 생성
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto); //list에 dto 객체들 담기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list; //list에 담아서 돌려줘야 하기 때문에
	}
	
	
	//code가 일치하면 삭제
	public boolean delete(int code) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "delete from bookTBL where code=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
		
		return flag;
	}
	
	
	//code가 일치하면 가격 업데이트
	public boolean update(int code, int price) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update bookTBL set price=? where code=?";
		try {
			pstmt = con.prepareStatement(sql); //sql 문 전송하기
			pstmt.setInt(1, price); //물음표 값 처리하기
			pstmt.setInt(2, code); //물음표 값 처리하기
			int result = pstmt.executeUpdate(); //실행
			
			if(result>0) flag = true; //수정 성공하면 true 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt); //sql 문 전송 닫아주기
		}
		
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
