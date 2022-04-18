package item.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import item.dto.ItemDTO;
import static item.dao.JdbcUtil.*;
public class ItemDAO {
	private Connection con;

	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD 작업
	//list => List 타입으로 담아서 반환하기 => getList() 로 만들기
	//sql = select * from item;
	public List<ItemDTO> getList() {
		List<ItemDTO> list = new ArrayList<>(); // 리스트 객체 생성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select num,category,name,psize,price,register_at from item";
		try {
			
			pstmt = con.prepareStatement(sql); //sql 전송
			rs = pstmt.executeQuery(); //결과 실행 => 결과 가져오기
			
			while(rs.next()) { //값이 없을 때 그만, 값이 여러개일 것이므로 while문으로
				ItemDTO itemDto = new ItemDTO(); //객체 생성 후 집어넣기
				itemDto.setNum(rs.getInt("num"));
				itemDto.setCategory(rs.getString("category"));
				itemDto.setName(rs.getString("name"));
				itemDto.setPsize(rs.getString("psize"));
				itemDto.setPrice(rs.getInt("price"));
				itemDto.setRegisterAt(rs.getDate("register_at"));
				
				list.add(itemDto); //하나의 정보 담고 또 담고 값이 끝날 때까지 담아서 리스트로 보여주기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
	}
	
	//입력하기
	//sql = insert into item values(?,?,?,?,?)
	public boolean insert(ItemDTO insertDto) {
		
		PreparedStatement pstmt = null;
		String sql = "insert into item(num,category,name,content,psize,price) " 
				+ "values(item_seq.nextval,?,?,?,?,?)";
		boolean flag = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getCategory());
			pstmt.setString(2, insertDto.getName());
			pstmt.setString(3, insertDto.getContent());
			pstmt.setString(4, insertDto.getPsize());
			pstmt.setInt(5, insertDto.getPrice());
			
			int result = pstmt.executeUpdate(); //실행하기
			if(result>0) flag = true; 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag; //성공/실패 알려주는 기능
	}
	
	//삭제하기
	public boolean delete(int num) {
		
		PreparedStatement pstmt = null;
		String sql = "delete from item where num=?";
		boolean flag = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	
	public boolean update(int num, String psize, int price) {
		PreparedStatement pstmt = null;
		String sql = "update item set psize=?,price=? where num=?";
		boolean flag = false;
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, psize);
			pstmt.setInt(2, price);
			pstmt.setInt(3, num);
			
			int result = pstmt.executeUpdate(); //숫자로 실행결과 알려주니까 boolean이 아니라 int로
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	
	public List<ItemDTO> serachList(String category,String name) {
		List<ItemDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select num,category,name,psize,price,register_at from item where category=? and name=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, category);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery(); //select 니까
			
			while(rs.next()) {
				ItemDTO itemDto = new ItemDTO();
				itemDto.setNum(rs.getInt("num"));
				itemDto.setCategory(rs.getString("category"));
				itemDto.setName(rs.getString("name"));
				itemDto.setPsize(rs.getString("psize"));
				itemDto.setRegisterAt(rs.getDate("register_at"));
				
				list.add(itemDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return list;
	}
	
	
}





















