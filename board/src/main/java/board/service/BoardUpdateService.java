package board.service;

import static board.dao.JdbcUtil.*;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardUpdateService {
	public boolean update(BoardDTO updateDto) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boolean flag = false;
		
		if(dao.updateArticle(updateDto)) {
			commit(con);
			flag=true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return flag;
	}
}
