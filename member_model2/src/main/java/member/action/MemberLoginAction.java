package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;

@AllArgsConstructor
public class MemberLoginAction implements Action {

	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//loginForm.jsp 에서 받아오기
		String userid = request.getParameter("userid"); 
		String password = request.getParameter("current_password");
		
		//db 작업(서비스 호출) => service 가 실질적인 디비 작업시키고 리턴받기
		MemberLoginService service = new MemberLoginService();
		MemberDTO loginDto = service.login(userid, password);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginDto", loginDto);
		
		
		return new ActionForward(path, true);
	}

}
