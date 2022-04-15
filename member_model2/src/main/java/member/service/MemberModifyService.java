package member.service;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberModifyService {
	public boolean modify(String userid, String confirmPassword) {
		
		Connection con = getConnection(); //드라이버 로드
		MemberDAO dao = new MemberDAO(con); //디비 연결
		
		boolean result = dao.changePassword(userid, confirmPassword); //dao 에서 메소드 가져오기
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
	}
}
