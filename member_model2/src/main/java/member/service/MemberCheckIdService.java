package member.service;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberCheckIdService {
	public boolean dupId(String userid) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean result = dao.checkId(userid); //아이디 중복 검사 메소드 호출
		
		close(con);
		
		return result;
	}
}
