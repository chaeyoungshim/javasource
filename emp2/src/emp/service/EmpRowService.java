package emp.service;

import java.sql.Connection;

import static emp.dao.JdbcUtil.*;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpRowService {
	
	public EmpDTO getRow(int empno) {		
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		EmpDTO dto = dao.getRow(empno);
		
		close(con);
		
		return dto;
	}
}








