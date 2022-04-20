package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.dto.SearchDTO;
import board.service.BoardSearchService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardSearchAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//serachForm에서 넘기는 값 가져오기
//		SearchDTO searchDTO = new SearchDTO();
//		searchDTO.setCriteria(request.getParameter("criteria"));
//		searchDTO.setKeyword(request.getParameter("keyword"));
//		
//		//service 작업
//		BoardSearchService service = new BoardSearchService();
//		List<BoardDTO> list = service.searchList(searchDTO);
//		
//		
//		request.setAttribute("list", list);
		
		
		//페이지 이동
		//return new ActionForward(path, false);
		return null;
	}

}
