package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.dto.BoardDTO;

import static board.dao.JdbcUtil.*;

public class BoardDAO {
	private Connection con;

	public BoardDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	//게시글 삽입,삭제,수정(게시글 수정,조회수 수정),조회,전체조회,
	public boolean insertArticle(BoardDTO insertDto) {
		PreparedStatement pstmt = null;
		String sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)"
				+ "values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
		boolean flag = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getPassword());
			pstmt.setString(3, insertDto.getTitle());
			pstmt.setString(4, insertDto.getContent());
			pstmt.setString(5, insertDto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	//리스트
	public List<BoardDTO> listArticle() { //리스트라 값 받을게 없음
		List<BoardDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//select bno,title,name,regdate,readcount from board order by desc, Error Msg = ORA-00936: missing expression
		
		String sql = "select bno,title,name,regdate,readcount from board order by bno desc";
		try {
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //select 니까 	executeQuery();
			
			while(rs.next()) { //값이 없을 때 그만, 값이 여러개일 것이므로 while문으로
				BoardDTO dto = new BoardDTO(); //객체 생성 후 집어넣기
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setReadCount(rs.getInt("readcount"));
				
				list.add(dto); //하나의 정보 담고 또 담고 값이 끝날 때까지 담아서 리스트로 보여주기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
	}
	
	
}
