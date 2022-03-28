package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpModifyService;
import emp.util.ConsoleUtil;

public class EmpModifyAction implements Action {
	@Override
	public void execute(Scanner sc) throws Exception {
		
		//입력받기 -  empno, mgr => ConsoleUtil
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO updateDto = util.getUpdateEmp(sc);
		EmpModifyService service = new EmpModifyService();
		boolean updateResult = service.modifyEmp(updateDto.getEmpno(), updateDto.getMgr());
		
		if(updateResult) {
			util.printUpdateSuccessMessage(updateDto);
		}else {
			util.printUpdateFailMessage(updateDto);
		}

	}

}
