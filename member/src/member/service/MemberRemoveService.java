package member.service;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberRemoveService {
	public boolean remove(int id) {
		
		boolean isRemoveSuccess = false;
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		if(dao.removeMember(id)) {
			commit(con);
			isRemoveSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		return isRemoveSuccess;
	}
}











