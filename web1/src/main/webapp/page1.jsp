<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
 	public void jspInit() {
 		System.out.println("jspInit()");
	}
	public void jspDestroy() {
		System.out.println("jspDestroy()");
	}
%>
<%
	System.out.println("_jspService1()");
	
	int i = 15;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=i %>
</body>
</html>