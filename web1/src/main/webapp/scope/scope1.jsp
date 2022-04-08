<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
	jsp에서 제공하는 내장 객체들 중 page, request, session, application 객체들은 해당 객체에
	유효한 범위 안에서 필요한 객체(데이터)들을 저장하고 읽어 들임으로써 서로 공유할 수
	있는 특정한 영역을 가지고 있음
	
	1) page : 현재 서비스되고 있는 페이지의 유효 범위를 가짐(X)
	
	2) request : request 유효 범위를 가짐(form, a 태그에서만 가져올 수 있음)
				 setAttribute() => getAttribute() -> 유효범위 지켜줘야 가져올 수 있음
				 form action에 써준 페이지, a href에 써 준 페이지까지만 가능
				 
	3) session : session 유효 범위를 가짐
				 HttpSession session => 유지 시간만큼 유효범위
				 브라우저 열고 닫기 전까지 유효범위
				 로그인, 장바구니 => 서버에 저장
				 
	4) application : 서버의 시작과 끝의 유효 범위를 가짐(X)
--%>
<%
	LoginDto loginDto = (LoginDto)session.getAttribute("loginDto"); //session 가져오기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <p>userid : <%= session.getAttribute("userid") %></p>
<p>password : <%= session.getAttribute("password") %></p> --%>

<p>userid : <%= loginDto.getUserid() %></p>
<p>password : <%= loginDto.getPassword() %> </p>
</body>
</html>