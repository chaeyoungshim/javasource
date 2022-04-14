package book.service;

import java.sql.Connection;
import java.util.List;

import book.dao.BookDAO;
import book.dto.BookDTO;

import static book.dao.JdbcUtil.*;


public class BookListService {
	public List<BookDTO> listAll() {
		
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		
		List<BookDTO> list = dao.getlist();
		
		close(con);
		
		return list;
	}
}
