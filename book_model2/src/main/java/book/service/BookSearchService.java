package book.service;

import java.sql.Connection;
import java.util.List;

import book.dao.BookDAO;
import book.dto.BookDTO;


import static book.dao.JdbcUtil.*;

public class BookSearchService {
	public List<BookDTO> list(String criteria, String keyword) { //이건 리스트로 담아서 반환해줘야 함 => 검색 후 결과가 여러 개가 나올 수 있기 때문에
		
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		List<BookDTO> list = dao.searchList(criteria, keyword);
		
		close(con);
		
		return list;
	}
}
