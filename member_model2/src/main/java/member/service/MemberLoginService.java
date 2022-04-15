package member.service;

import java.sql.Connection;

import static member.dao.JdbcUtil.*;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberLoginService {
	public MemberDTO login(String userid, String password) {
		Connection con = getConnection(); //드라이버 로드
		MemberDAO dao = new MemberDAO(con); //디비 연결
		
		MemberDTO loginDto =  dao.isLogin(userid, password); //DAO에서 이미 작업해놓은 로그인 메소드 호출
		//isLogin() 에서는 select 이기 때문에 커밋 롤백 필요 없음
		close(con);
		
		return loginDto;
	}
}
