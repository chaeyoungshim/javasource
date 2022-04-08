<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//특정 세션 삭제
	session.removeAttribute("name");
	//원래 있던 곳으로 돌아가기
	response.sendRedirect("sessionTest1.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>