package book.service;

import java.sql.Connection;

import book.dao.BookDAO;
import static book.dao.JdbcUtil.*;


public class BookDeleteService {
	public boolean remove(int code) { //코드 넘겨서 삭제해야 하니까 코드 받기
		//db 작업
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		
		boolean result = dao.delete(code);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return result;
	}
}
