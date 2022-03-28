package member.action;

import java.util.Scanner;

import member.service.MemberModifyService;
import member.util.ConsoleUtil;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 주소, 이메일 수정
		ConsoleUtil util = new ConsoleUtil();
		
		// id 입력받기
		int id = util.printModifyIdMessage(sc);		
		// 어떤부분을 수정할 것인지 사용자에게 질문 화면 제시
		int no = util.printModifyMessage(sc); //1(주소), 2(이메일)
		// 변경할 값에 대해서 사용자에게 입력 받는 화면 제시
		String input = util.printModifyValueMessage(sc); // 서울시 도봉구, hong@naver.com
		
		//서비스 작업 요청
		MemberModifyService service = new MemberModifyService();
		boolean result = service.update(no, input, id);
		
		
		if(result) {
			util.printModifySuccessMessage();
		}else {
			util.printModifyFailMessage();
		}
		
		
	}
}


















