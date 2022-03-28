package exam;

public class MemberServiceEx {
	public static void main(String[] args) {
		// MemberService 객체 생성
		MemberService service = new MemberService();
		// login 메소드 호출
		boolean result = service.login("hong", "12345");
		// 메소드호출 결과를 받아 true 인 경우 "로그인되었습니다" 메세지 출력
		//                                     로그아웃 메소드 호출
		if(result) {
			System.out.println("로그인되었습니다");
			service.logout();
		}else {
		// false 경우 "id 또는 password가 올바르지 않습니다" 메세지 출력
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
	}
}
