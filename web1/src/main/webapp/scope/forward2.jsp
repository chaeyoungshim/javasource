<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//forward1.jsp 에서 넘긴 값 가져오기 ==> request.getParameter("")	

	request.setAttribute("name", "홍길동");
	
	pageContext.forward("forward3.jsp"); //request/response 를 forward3.jsp 와 공유
%>