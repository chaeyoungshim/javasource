<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>forward1</h1>
<form action="forward2.jsp" method="post">
	<div>
		<label>아이디</label>
		<input type="text" name="userid" id="userid" />
	</div>
	<div>
		<label>비밀번호</label>
		<input type="password" name="password" id="password" />
	</div>
	<div>
		<input type="submit" value="전송" />
	</div>
</form>
</body>
</html>