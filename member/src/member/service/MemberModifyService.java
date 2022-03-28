package member.service;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberModifyService {
	
	public boolean update(int no, String input, int id) {
		
		boolean isModifySuccess = false;
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		if(dao.updateMember(no, input, id)) {
			isModifySuccess = true;
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return isModifySuccess;		
	}
}







