package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberJoinService;

@AllArgsConstructor
public class MemberJoinAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// joinForm.jsp 에서 넘기는 객체 받아오기(6개)
		MemberDTO registerDto = new MemberDTO();
		registerDto.setUserid(request.getParameter("userid"));
		registerDto.setPassword(request.getParameter("password"));
		registerDto.setName(request.getParameter("name"));
		registerDto.setGender(request.getParameter("gender"));
		registerDto.setEmail(request.getParameter("email"));
		String confirmPassword = request.getParameter("confirm_password");//얜 따로 받기
		
		//db작업은 service한테 시키기 때문에 service 호출
		MemberJoinService service = new MemberJoinService(); //호출
		
		if(confirmPassword.equals(registerDto.getPassword())) {
			if(!service.join(registerDto)) {
				path = "/view/joinForm.jsp"; //실패 시 등록 못 했으니까 다시 기존 창으로 이동
			}
		}
		return new ActionForward(path, true);
	}

}
