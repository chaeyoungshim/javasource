package member.action;

import java.util.Scanner;

import member.service.MemberRemoveService;
import member.util.ConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//id를 입력할 화면 제시
		ConsoleUtil util = new ConsoleUtil();
		int id = util.printRemoveMessage(sc);
		
		//서비스 요청
		MemberRemoveService service = new MemberRemoveService();
		
		if(service.remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}

	}

}












