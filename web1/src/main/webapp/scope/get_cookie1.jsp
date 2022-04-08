<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//가져온 쿠키들 중에서 이름과 일치하는 쿠키 값을 가져오기
	private String getCookieValue(Cookie[] cookies, String name) {
		if(cookies == null) {
			return null;
		}
		for(Cookie c:cookies) {
			if(c.getName().equals(name)) {
				return c.getValue();
			}
		}
		return null;
	}
%>
<%
	//브라우저가 기억하는 쿠키 가져오기
	Cookie[] cookies = request.getCookies();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이름 : <%= getCookieValue(cookies, "name") %></h3>
<h3>나이 : <%= getCookieValue(cookies, "age") %></h3>
<h3>성별 : <%= getCookieValue(cookies, "gender") %></h3>
</body>
</html>