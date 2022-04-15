package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;
import member.service.MemberModifyService;

@AllArgsConstructor
public class MemberModifyAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String password = request.getParameter("current_password");
		String newPassword = request.getParameter("new_password");
		String confirmPassword = request.getParameter("confirm_password");
		
		HttpSession session = request.getSession();
		MemberDTO loginDto = (MemberDTO)session.getAttribute("loginDto"); //세션에 유저 정보(아이디,비밀번호)가 담겨있기 때문에(:MemberLoginAction.jsp에서 담음) loginDto를 가져온다
		String userid = loginDto.getUserid(); //유저 정보 중 아이디가 필요하기 때문에 아이디만 추출한다
		
		MemberLoginService loginService = new MemberLoginService();
		if(loginService.login(userid, password)!=null) {  //현재 비밀번호가 일치하면
			
			MemberModifyService service = new MemberModifyService();
			
			if(newPassword.equals(confirmPassword)) { //두 개의 비밀번호가 같은지 확인
				if(!service.modify(userid, confirmPassword)) { //변경 실패
					path = "/view/modifyForm.jsp";
				}else { //비밀번호 변경 성공
					session.invalidate();
				}
			}
		}else {
			path = "/view/modifyForm.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
