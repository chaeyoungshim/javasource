<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//loginForm 넘긴 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	//db 작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	MemberDTO loginDto = dao.isLogin(userid, password);
	
	
	JdbcUtil.close(con);
	
	//페이지 이동
	String path = "loginForm.jsp";
	if(loginDto!=null) { //로그인 성공
		session.setAttribute("loginDto", loginDto); //계속해서 정보가 유지되어야 해서
	}/* else {//로그인 실패
		path = "loginForm.jsp"; // '/'를 안 붙이면 맨 뒤 주소만 바꿔줘 라는 의미
	} */
	response.sendRedirect(path);
%>