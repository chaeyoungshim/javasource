package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookInsertService;

public class BookInsertAction implements Action {

	private String path;
	
	public BookInsertAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		//insert.jsp에서 넘어오는 값 가져오기(BookDTO)
		BookDTO dto = new BookDTO();
		dto.setCode(Integer.parseInt(request.getParameter("code")));
		dto.setTitle(request.getParameter("title"));
		dto.setWriter(request.getParameter("writer"));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));
		
		//service 호출
		BookInsertService service = new BookInsertService();
		if(!service.inserBook(dto)) {
			path = "/insert.jsp"; //입력 실패 시 경로 설정
		}
		// ActionForward 객체 생성 후 리턴
		return new ActionForward(path, true); //
	}

}
