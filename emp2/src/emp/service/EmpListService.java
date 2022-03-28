package emp.service;

import java.sql.Connection;
import java.util.List;

import static emp.dao.JdbcUtil.*;


import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

// ~~Service : 실질적인 비즈니스 로직을 처리
public class EmpListService {
	
	public List<EmpDTO> getEmpList(){
		
		Connection con = getConnection();		
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpDTO> list = dao.getList();
		
		close(con);
		
		return list;
	}
}
