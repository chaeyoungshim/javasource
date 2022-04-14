package pattern.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.service.LoginService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("LoginAction");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		//db 작업 => Service 
		LoginService service = new LoginService();
		if(service.login(userid, password)) {
			//페이지 이동
			//path = "index.jsp";
		}else {
			//path = "loginForm.jsp";
		}
		//각 액션에서 일이 끝난 후 path, 어떤 방식으로(forward, sendRedirect) 움직일 것인지 리턴
		return new ActionForward("path",true); 
	}

}
