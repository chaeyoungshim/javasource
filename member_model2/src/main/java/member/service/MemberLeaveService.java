package member.service;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberLeaveService {
	public boolean remove(String userid, String password) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con); //디비 연결
		
		boolean result = dao.leave(userid, password);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
	}
}
