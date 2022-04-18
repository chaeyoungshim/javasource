package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardListService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardListAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//리스트라 넘어오는 값은 없음, 바로 서비스 호출
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.list();
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
