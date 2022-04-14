package book.service;

import java.sql.Connection;

import book.dao.BookDAO;
import book.dto.BookDTO;
import static book.dao.JdbcUtil.*;

public class BookInsertService {
	public boolean inserBook(BookDTO insertDto) {
		
		//db 작업
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		boolean flag = dao.insert(insertDto);
		
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return flag;
	}
}
