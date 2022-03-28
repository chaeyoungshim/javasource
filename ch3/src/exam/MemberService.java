package exam;

public class MemberService {
	
	//멤버변수 : id,password
	private String id;
	private String password;
	
	//default 생성자
	public MemberService() {
		
	}
	//메소드 : 리턴타입-boolean
	//login  : id와 password를 받아서 id가 hong 이고, password 12345 인 경우만
	//         true로 리턴, 그 이외의 값은 false 리턴
	boolean login(String id,String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	//logout : 매개변수(인자)는 없음/리턴타입 없음
	//         로그아웃 되었습니다 메세지 출력 
	void logout() {
		System.out.println("로그아웃 되었습니다");
	}
}












