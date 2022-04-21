package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.dto.SearchDTO;
import board.service.BoardHitUpdateService;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardViewAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//bno 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//페이지 나누기 후 추가되는 부분
		int page = Integer.parseInt(request.getParameter("page"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		SearchDTO searchDto = new SearchDTO(criteria, keyword, page, amount);
		
		//서비스 작업
		BoardViewService service = new BoardViewService();
		BoardDTO dto = service.read(bno); //원본에 대한 정보 담겨져있음
		
		request.setAttribute("dto", dto); //이 정보를 담아서 페이지 이동
		request.setAttribute("searchDto", searchDto); //jsp 로 이동하기 때문에 이젠 담아서 보내기
		
		//페이지 이동
		return new ActionForward(path, false); //setAttribute이기 때문에
	}

}
