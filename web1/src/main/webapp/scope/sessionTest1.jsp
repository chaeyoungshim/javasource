<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션이 있는지 확인
	/* String name = "";
	if(session.getAttribute("name") != null) {
		name = (String)session.getAttribute("name");
	}else {
		name = "세션 없음";
	} */
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>현재 세션 값 : <%= name %> </h1> --%>
<%
	//세션 전부 가져오기
	Enumeration<String> sessions = session.getAttributeNames(); //리턴 타입이 Enumeration<String>
	
	String name = "";
	
	while(sessions.hasMoreElements()) { //값을 계속 가지고 있다면
		name = sessions.nextElement();
		if(name!=null) {
			out.print("<h1>세션 확인 : " + name + "</h1>");
		}
	}
	
%>



<br>
<hr>
<h1>세션 테스트</h1>
<button type="button" onclick="location.href='sessio_set.jsp'">세션 값 저장</button>
<button type="button" onclick="location.href='session_delete.jsp'">특정 세션 값 삭제</button>
<button type="button" onclick="location.href='session_invalidate.jsp'">세션 값 초기화</button>
</body>
</html>