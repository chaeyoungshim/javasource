<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/insert.do" method="post">
	<div>
		<label for="userid">userid</label>
		<input type="text" name="userid" id="userid" />
	</div>
	<div>
		<button>보내기</button>
	</div>
</form>
<ul>
	<li><a href="/select.do">리스트</a></li>
</ul>
</body>
</html>