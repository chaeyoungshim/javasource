<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	jsp 내장객체
	
	1) HttpServletRequest request : 사용자의 요청을 가져올 수 있음
	2) HttpServletRequest response : 사용자에게 응답할 때 사용
	3) javax.servlet.jsp.PageContext : 다른 내장 객체에 접근 가능한 객체
	4) HttpSession session : http(s) 의 연결 방식은 stateless 를 보완하기 위해 사용(ex> 장바구니)
	5) ServletContext application : 서버 측 정보와 서버측 자원에 대한 정보 및 해당 애플리케이션의
									이벤트 로그를 다루는 객체
 -->
 <%
 	//세션 유효시간 설정(10초)
	session.setMaxInactiveInterval(10);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>세션 테스트</h3>
<p>isNew() : <%= session.isNew() %></p>
<p>생성시간 : <%= session.getCreationTime() %></p>
<p>최종 접속 시간 : <%= session.getLastAccessedTime() %></p>
<p>세션 ID : <%= session.getId() %></p>
</body>
</html>