package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpRowService;
import emp.util.ConsoleUtil;

public class EmpRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		EmpRowService service  = new EmpRowService();
		
		ConsoleUtil util = new ConsoleUtil();
		int empno=util.printRowMessage(sc);
		
		EmpDTO dto = service.getRow(empno);
		
		//출력
		util.printEmpMessage(dto);

	}

}
