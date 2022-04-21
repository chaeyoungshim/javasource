package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.dto.PageDTO;
import board.dto.SearchDTO;
import board.service.BoardListService;
import board.service.BoardTotalRowsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardListAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		//페이지 나누기 - 사용자가 요청한 페이지 가져오기
		int page = Integer.parseInt(request.getParameter("page"));
		int amount = 10;
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		SearchDTO searchDto = new SearchDTO(criteria, keyword, page, amount);
		
		
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.list(searchDto); //가장 최신 게시물 10개(사용자가 요청한 페이지 기준으로) 가져오기
		
		//전체 게시물 수
		BoardTotalRowsService rows = new BoardTotalRowsService();
		int totalRows = rows.total(criteria, keyword);
		
		PageDTO pageDto = new PageDTO(totalRows, searchDto);
		
		
		request.setAttribute("list", list);
		request.setAttribute("pageDto", pageDto);
		
		return new ActionForward(path, false);
	}

}
