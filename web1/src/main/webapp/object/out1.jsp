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
	6) JspWriter out : 자바 변수를 화면 출력 시 사용
	7) Object page : 현재 서비스되고 있는 jsp를 의미
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1;i<101;i++) {
		out.print(i+ " ");
	}
%>
</body>
</html>