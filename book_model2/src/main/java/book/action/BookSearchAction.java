package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookSearchService;

public class BookSearchAction implements Action {
	
	private String path;
	
	public BookSearchAction(String path) {
		super();
		this.path = path;
	}
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		BookSearchService service = new BookSearchService();
		
		List<BookDTO> list = service.list(criteria, keyword);
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
