package member.service;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

import java.sql.Connection;

public class MemberJoinService {
	public boolean join(MemberDTO registerDto) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean result = dao.register(registerDto);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return result;
	}
}
