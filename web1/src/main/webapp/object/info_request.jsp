<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//info.jsp 에서 사용자가 넘긴 값을 가져오기
	//무조건 String 형태로 값이 넘어옴
	
	request.setCharacterEncoding("utf-8");
	
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	String job = request.getParameter("job");
	//getParameter 는 String 형태로 하나만 가져옴, 배열로 가지고 와야 여러 개 가져오기 성공
	String favorite[] = request.getParameterValues("favorite"); 
	String gender = request.getParameter("gender");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	userid : <%= userid %>
</p>
<p>
	password : <%= password %>
</p>
<p>
	job : <%= job %>
</p>
<p>
	favorite : <%= Arrays.toString(favorite) %>
</p>
<p>
	gender : <%= gender %>
</p>
</body>
</html>