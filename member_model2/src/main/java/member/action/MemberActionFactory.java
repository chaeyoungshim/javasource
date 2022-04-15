package member.action;

public class MemberActionFactory {
	
	private static MemberActionFactory baf;
	
	private MemberActionFactory() {}
	
	public static MemberActionFactory getInstance() {
		if(baf == null) {
			baf = new MemberActionFactory();
		}
		return baf;
	}
	
	Action action = null;
	public Action action(String cmd) { //주소 받기
		//Action 생성 시
		if(cmd.equals("/login.do")) { //    /login.do 를 실행
			action = new MemberLoginAction("/view/loginForm.jsp"); // login.do 실행 후 보여줄 화면은 loginForm.jsp
		}else if(cmd.equals("/logout.do")) {
			action = new MemberLogoutAction("/view/loginForm.jsp");
		}else if(cmd.equals("/leave.do")) {
			action = new MemberLeaveAction("/index.jsp");
		}else if(cmd.equals("/modify.do")) {
			action = new MemberModifyAction("/view/loginForm.jsp"); //성공 시에 변경됐으니까 로그인 창으로 이동
		}else if(cmd.equals("/join.do")) {
			action = new MemberJoinAction("/view/loginForm.jsp"); //성공 시 등록했으니까 로그인 창으로 이동
		}else if(cmd.equals("/checkId.do")) {
			action = new MemberCheckIdAction("/view/checkId.jsp");
		}
		
		
		return action;
	}
	
}
