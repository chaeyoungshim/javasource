<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키 : 클라이언트 측(브라우저)이 보관
	//		생존기간 지정 가능

	//쿠키 데이터 저장 => 응답 시 브라우저에 저장
	//쿠키 유효 시간 : session
	response.addCookie(new Cookie("name", "john"));
	response.addCookie(new Cookie("gender", "male"));
	response.addCookie(new Cookie("age", "30"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키 데이터 저장</h3>
<a href="get_cookie1.jsp">이동</a>
</body>
</html>