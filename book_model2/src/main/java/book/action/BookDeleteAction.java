package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookDeleteService;

public class BookDeleteAction implements Action {
	
	private String path;
	
	public BookDeleteAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		int code = Integer.parseInt(request.getParameter("code"));
		
		//service 작업
		BookDeleteService service = new BookDeleteService();
		
		
		if(!service.remove(code)) {  //입력한 코드 삭제하기
			path = "/delete.jsp"; //실패 시 원래 페이지로 가기
		}
		
		
		return new ActionForward(path, true);
	}

}
