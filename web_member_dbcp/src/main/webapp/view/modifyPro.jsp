<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//modifyForm에서 넘긴 값 가져오기
	String password = request.getParameter("current_password");
	String newPassword = request.getParameter("new_password");
	String confirmPassword = request.getParameter("confirm_password");
	
	//userid, 현재 비밀번호가 일치하면(isLogin) 비밀번호 변경(changePassword)
	//세션에 담긴 로그인 정보 가져오기
	MemberDTO loginDto = (MemberDTO)session.getAttribute("loginDto");
	String userid = loginDto.getUserid();
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	MemberDAO dao = new MemberDAO(con); //디비 연결
	
	String path = "";
	if(dao.isLogin(userid, password)==null) {
		out.print("<script>");
		out.print("alert('현재 비밀번호를 확인해 주세요');");
		out.print("history.back();");
		out.print("</script>");
	}else {
		//새 비밀번호와 새 비밀번호 확인이 같은 값인지 확인
		if(newPassword.equals(confirmPassword)) {
			//비밀번호 변경(changePassword)
			boolean result = dao.changePassword(userid, confirmPassword);
			//세션 해제
			//페이지 이동
			//성공 - loginForm.jsp / 실패 - modifyForm.jsp
			if(result) {
				JdbcUtil.commit(con);
				session.invalidate();
				path = "loginForm.jsp";
			}else {
				JdbcUtil.rollback(con);
				path = "modifyForm.jsp";
			}
		}else {
			path = "modifyForm.jsp";
		}
		JdbcUtil.close(con);
		response.sendRedirect(path);
	}
	
%>