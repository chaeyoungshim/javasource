package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
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
		
		
		//서비스 작업
		BoardViewService service = new BoardViewService();
		BoardDTO dto = service.read(bno); //원본에 대한 정보 담겨져있음
		
		request.setAttribute("dto", dto); //이 정보를 담아서 페이지 이동
		
		//페이지 이동
		return new ActionForward(path, false); //setAttribute이기 때문에
	}

}
