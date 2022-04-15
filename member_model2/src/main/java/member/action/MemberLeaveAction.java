package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.service.MemberLeaveService;

@AllArgsConstructor
public class MemberLeaveAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userid = request.getParameter("userid");
		String password = request.getParameter("current_password");
		
		//db 작업, 서비스 호출
		MemberLeaveService service = new MemberLeaveService();
		if(!service.remove(userid, password)) {
			path = "/view/leaveForm.jsp"; //실패하면 탈퇴페이지 다시 보여주기
		}else {
			HttpSession session = request.getSession();
			session.invalidate();
		}
		
		return new ActionForward(path, true);
	}

}
