<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!-- include : 여러 개의 페이지를 하나로 만든 후 컴파일 -->
<%@ include file="./header.jsp" %> <!-- 현재 페이지의 header.jsp 가져오기(포함) -->
<div>
	<h1>main</h1>
</div>
<% 
	int num = 10;
%>
<%@ include file="./footer.jsp" %> <!-- 현재 페이지의 footer.jsp 가져오기(포함) -->