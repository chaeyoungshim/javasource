package emp.action;

import java.util.Scanner;

import emp.service.EmpRemoveService;
import emp.util.ConsoleUtil;

public class EmpRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.removeEmpno(sc);
		
		EmpRemoveService service = new EmpRemoveService();
		
		if(service.empRemove(empno)) {
			util.printRemoveSuccessMessage(empno);
		}else {
			util.printRemoveFailMessage(empno);
		}
				

	}

}







