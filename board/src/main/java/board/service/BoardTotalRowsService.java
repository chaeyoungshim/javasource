package board.service;

import static board.dao.JdbcUtil.*;

import java.sql.Connection;

import board.dao.BoardDAO;

public class BoardTotalRowsService {
	public int total(String criteria, String keyword) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		int totalRows = dao.totalRows(criteria, keyword);
		
		close(con);
		
		return totalRows;
	}
}
