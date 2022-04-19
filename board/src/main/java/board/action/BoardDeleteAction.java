package board.action;

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
		
		//service 작업
		BoardDeleteService service = new BoardDeleteService();
		
		
		if(!service.remove(bno, password)) {
			path = "/view/qna_board_pwdCheck.jsp?bno="+bno;
		}
		
		
		
		return new ActionForward(path, true);
	}

}
