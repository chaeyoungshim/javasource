package board.service;

import static board.dao.JdbcUtil.*;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardViewService {
	public BoardDTO read(int bno) {
		Connection con = getConnection();
		
		BoardDAO dao = new BoardDAO(con);
		BoardDTO dto = dao.getRow(bno); //원보글에 대한 정보가 담겨있음
		
		close(con);
		
		return dto;
	}
}
