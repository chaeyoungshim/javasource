package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookUpdateService;

public class BookUpdateAction implements Action {

	private String path;
	
	public BookUpdateAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		//db 작업 => service 가 작업
		BookUpdateService service = new BookUpdateService();
		if(!service.modify(code, price)) { 		//입력받은 코드와 가격을 수정해줌
			path = "/update.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
