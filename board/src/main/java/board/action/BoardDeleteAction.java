package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardDeleteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardDeleteAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//bno 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		//password 가져오기
		String password = request.getParameter("password");
		
		//페이지 나누기 후 추가되는 부분
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"),"utf-8");

		
		//service 작업
		BoardDeleteService service = new BoardDeleteService();
		
		
		if(!service.remove(bno, password)) {
			path = "/view/qna_board_pwdCheck.jsp?bno="+bno+"&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;    
		}else {
			path += "?page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;
		}
		
		
		
		return new ActionForward(path, true);
	}

}
