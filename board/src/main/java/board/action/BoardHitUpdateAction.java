package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardHitUpdateService;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardHitUpdateAction implements Action {
	
	private String path; // /qView.do

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//bno 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//페이지 나누기 후 추가되는 부분
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"),"utf-8");
		
		
		//service 작업 => 조회수 업데이트
		BoardHitUpdateService update = new BoardHitUpdateService();
		update.read(bno);
		
		
		//path += "?bno="+bno; // /qView.do?bno=3 이런 식으로
		
		//페이지 나누기 후 path
		// /qView.do?bno=3&page=1&amount=10&criteria=&keyword=
		path += "?bno="+bno+"&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;  
		
		
		//페이지 이동
		return new ActionForward(path, true); //true => sendRedirect 방식으로 : 주소가 바뀌어버림
	}

}
