<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// userid 가져오기
	String userid = request.getParameter("userid");
	
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	if(!dao.checkId(userid)) {
		out.print("false");
	}else {
		out.print("true");
	}
%>