package board.service;

import java.sql.Connection;
import java.util.List;

import static board.dao.JdbcUtil.*;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import board.dto.SearchDTO;

public class BoardListService {
	public List<BoardDTO> list(SearchDTO searchDto) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		List<BoardDTO> list = dao.listArticle(searchDto);
		
		close(con);
		
		return list;
	}
}
