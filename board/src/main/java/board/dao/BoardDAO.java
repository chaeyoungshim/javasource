package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.dto.BoardDTO;
import board.dto.SearchDTO;

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
	public List<BoardDTO> listArticle(SearchDTO searchDto) { //리스트라 값 받을게 없음
		List<BoardDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		//String sql = "select bno,title,name,regdate,readcount,re_ref,re_seq,re_lev from board order by re_ref desc, re_seq asc";      
		
		try {
			
			int start = searchDto.getPage() * searchDto.getAmount();
			int end = (searchDto.getPage()-1) * searchDto.getAmount();
			
			//리스트 요청
			if(searchDto.getCriteria().isEmpty()) {
				sql = "select * from (select rownum as rnum, A.* ";
				sql += " from (select bno, title, name, regdate, readcount, re_ref, re_lev, re_seq ";
				sql	+= " from board ";
				sql	+= " where bno > 0 order by re_ref desc, re_seq asc) A ";
				sql	+= " where rownum <= ?) ";
				sql	+= " where rnum > ?";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, start);
				pstmt.setInt(2, end);
				
			}else {
				//검색 요청
				sql = "select * from (select rownum as rnum, A.* ";
				sql += " from (select bno, title, name, regdate, readcount, re_ref, re_lev, re_seq ";
				sql	+= " from board ";
				sql	+= " where bno > 0 and " + searchDto.getCriteria() + " like ? order by re_ref desc, re_seq asc) A ";
				sql	+= " where rownum <= ?) ";
				sql	+= " where rnum > ?";
				
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+searchDto.getKeyword()+"%");
				pstmt.setInt(2, start);
				pstmt.setInt(3, end);
			}
			
			rs = pstmt.executeQuery(); //select 니까 	executeQuery();
			while(rs.next()) { //값이 없을 때 그만, 값이 여러개일 것이므로 while문으로
				BoardDTO dto = new BoardDTO(); //객체 생성 후 집어넣기
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setReadCount(rs.getInt("readcount"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				//list.jsp에서 사용하는 컬럼은 re_lev인데 위에 두개는 뽑아만 놓은 것
				dto.setReLev(rs.getInt("re_lev"));
				
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
	
	//전체 게시물 개수
	public int totalRows(String criteria, String keyword) {
		PreparedStatement pstmt = null;
		ResultSet rs=  null;
		String sql = "";
				
		int total = 0;
		try {
			
			if(criteria.isEmpty()) {
				sql = "select count(*) from board";
				pstmt = con.prepareStatement(sql);
			}else {
				sql = "select count(*) from board where " +criteria + " like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+keyword+"%");

			}
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1); //rs가 가지고 있는 결과값 하나를 넣어줘
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return total;
	}
	
	
	
	//select bno,name,title,content,attach from board where bno=?
	public BoardDTO getRow(int bno) {
		BoardDTO dto = null;
		PreparedStatement pstmt = null;
		String sql = "select bno,name,title,content,attach,re_ref,re_seq,re_lev from board where bno=?";
		ResultSet rs = null;
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
				//댓글 작업시 필요한 부분
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				dto.setReLev(rs.getInt("re_lev"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return dto;
	}
	
	// 조회수 업데이트 => update board set readcount=readcount+1 where bno=?;
	public boolean hitUpdate(int bno) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update board set readcount=readcount+1 where bno=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//게시물 삭제
	public boolean deleteArticle(int bno, String password) {
		PreparedStatement pstmt = null;
		String sql = "delete from board where bno=? and password=?";
		boolean flag = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, password);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//게시물 수정
	public boolean updateArticle(BoardDTO updateDto) {
		boolean result = false;
		PreparedStatement pstmt = null;
		String sql = "";
		try {
			if(updateDto.getAttach()!=null) { //파일첨부가 되어 있으면(값이 있으면)
				sql = "update board set title=?, content=?, attach=? where bno=? and password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setString(3, updateDto.getAttach());
				pstmt.setInt(4, updateDto.getBno());
				pstmt.setString(5, updateDto.getPassword());
			}else {
				sql = "update board set title=?, content=? where bno=? and password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setInt(3, updateDto.getBno());
				pstmt.setString(4, updateDto.getPassword());
			}
			
			int flag = pstmt.executeUpdate();
			
			if(flag>0) result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	
	// 댓글 
	public boolean reply(BoardDTO replyDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "";
		try {
			
			int re_ref = replyDto.getReRef();
			int re_seq = replyDto.getReSeq();
			int re_lev = replyDto.getReLev();
			
			//기존 댓글에 대한 업데이트
			
			sql = "update board set re_seq = re_seq + 1 where re_ref = ? and re_seq > ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
			
			int updateCnt = pstmt.executeUpdate(); //얘는 새 댓글을 달 때 0이 나올 수도 있기 때문에 밑에 if절에서 제외
			
			close(pstmt); //일단 먼저 닫아줘야 함 다시 또 해야 해서
			
			//댓글 삽입
			//댓글 작성(re_ref : 원본글의 re_ref 값과 동일하게 삽입,
			//		--		  re_lev : 원본글의 re_lev + 1 삽입
			//		--		  re_seq : 원본글의 re_seq + 1 삽입)
			
			re_lev = re_lev + 1;
			re_seq = re_seq + 1;
			
			sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) ";
			sql += "values(board_seq.nextval,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, replyDto.getName());
			pstmt.setString(2, replyDto.getPassword());
			pstmt.setString(3, replyDto.getTitle());
			pstmt.setString(4, replyDto.getContent());
			pstmt.setString(5, replyDto.getAttach());
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			
			int insertCnt = pstmt.executeUpdate();
			
			if(insertCnt >0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	//검색 => option 에서 세 가지 방법이 있다 => 리스트 형식으로 담기 여러개일 수 있으니까
	// criteria=title&keyword=사진 or 
	// criteria=content&keyword=사진 or
	// criteria=name&keyword=사진
	public List<BoardDTO> serachList(SearchDTO searchDto) { //따로 SearchDTO 만들어서 여기다 담아서 꺼내쓰기
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select 니까
		try {
			
			String sql = "select bno,title,name,regdate,readcount,re_ref,re_seq,re_lev ";
			sql += "from board where "+searchDto.getCriteria()+" like ? order by re_ref desc, re_seq asc";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+searchDto.getKeyword()+"%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) { //값이 없을 때 그만, 값이 여러개일 것이므로 while문으로
				BoardDTO dto = new BoardDTO(); //객체 생성 후 집어넣기
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setReadCount(rs.getInt("readcount"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				//list.jsp에서 사용하는 컬럼은 re_lev인데 위에 두개는 뽑아만 놓은 것
				dto.setReLev(rs.getInt("re_lev"));
				
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

























