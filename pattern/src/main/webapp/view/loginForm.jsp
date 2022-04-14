<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/login.do" method="post">
	<div>
		<label for="userid">userid</label>
		<input type="text" name="userid" id="userid" />
	</div>
	<div>
		<label for="password">password</label>
		<input type="password" name="password" id="password" />
	</div>
	<div>
		<button>보내기</button>
	</div>
</form>
</body>
</html>