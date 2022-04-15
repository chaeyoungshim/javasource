package book.service;

import static book.dao.JdbcUtil.*;

import java.sql.Connection;

import book.dao.BookDAO;


public class BookUpdateService {
	public boolean modify(int code, int price) {
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		boolean result = dao.update(code, price);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return result;
	}
}
