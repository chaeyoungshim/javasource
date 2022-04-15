package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

@AllArgsConstructor
public class MemberDAO {
	private Connection con;
	//C(회원가입), R(로그인), U(비밀번호변경), D(회원탈퇴) 작업
	//로그인 - 사용자가 입력한 아이디, 비밀번호가 존재하느냐?
	//		 select userid, name from membertbl where userid='hong123' and password='hong123@'
	public MemberDTO isLogin(String userid, String password) {
		MemberDTO loginDto = null; //현재 비밀번호를 틀리게 입력할 시에 디비 쪽에서 이해를 못하고 null로 인식하기 때문에 modifyPro.jsp 에서  == null 로 해야 함
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select userid,name from membertbl where userid=? and password=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginDto = new MemberDTO();
				loginDto.setUserid(rs.getString(1)); //rs.getString("userid")
				loginDto.setName(rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return loginDto;
	}
	
	
	//비밀번호 변경
	// update membertbl set password='변경비밀번호' where userid='hong123';
	// update membertbl set password='변경비밀번호' where userid='hong123' and password='현재비밀번호';
	public boolean changePassword(String userid, String confirmPassword) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update membertbl set password=? where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, confirmPassword);
			pstmt.setString(2, userid);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	//탈퇴
	//sql = delete from membertbl where userid=?;
	public boolean leave(String userid, String password) {//성공하면 1, 실패하면 0 을 leavePro.jsp한테 반환해줌
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "delete from membertbl where userid=? and password=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//회원가입
	// insert into membertbl values(?,?,?,?,?);
	public boolean register(MemberDTO registerDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into membertbl values(?,?,?,?,?)"; //아이디,비밀번호,이름,성별,이베일 => 한꺼번에 처리
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, registerDto.getUserid());
			pstmt.setString(2, registerDto.getPassword());
			pstmt.setString(3, registerDto.getName());
			pstmt.setString(4, registerDto.getGender());
			pstmt.setString(5, registerDto.getEmail());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return flag;
	}
	
	// 중복 아이디 검사
	// select userid from membertbl where userid='hong';
	public boolean checkId(String userid) {
		boolean flag = true;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select userid from membertbl where userid=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				flag = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return flag;
	}
	
	
	
	
	
	
	
}
