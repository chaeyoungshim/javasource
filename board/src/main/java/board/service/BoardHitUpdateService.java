package board.service;

import static board.dao.JdbcUtil.*;

import java.sql.Connection;

import board.dao.BoardDAO;

public class BoardHitUpdateService { //커밋과 롤백이 관건, 반환할 필요 x
	
	public void read(int bno) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		if(dao.hitUpdate(bno)) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
	}
}
