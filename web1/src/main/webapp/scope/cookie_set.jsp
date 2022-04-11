<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("language",request.getParameter("language"));
	cookie.setMaxAge(60*60*24);
	response.addCookie(cookie);
	
	response.sendRedirect("cookie3.jsp"); //다시 돌아가기
%>