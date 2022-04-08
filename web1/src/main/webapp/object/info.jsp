<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>개인정보</h3>
<form action="info_request.jsp" method="post">
	<div>
		<label>아이디</label>
		<input type="text" name="userid" id="userid" />
	</div>
	<div>
		<label>비밀번호</label>
		<input type="password" name="password" id="password" />
	</div>
	<div>
		<label>직업</label>
		<select name="job" id="job">
			<option value="무직">무직</option>
			<option value="학생">학생</option>
			<option value="회사원">회사원</option>
		</select>
	</div>
	<div>
		<label>관심분야</label>
		<input type="checkbox" name="favorite" id="" value="정치"/>정치
		<input type="checkbox" name="favorite" id="" value="사회"/>사회
		<input type="checkbox" name="favorite" id="" value="컴퓨터"/>컴퓨터
	</div>
	<div>
		<label>성별</label>
		<input type="radio" name="gender" id="" value="남자"/>남자
		<input type="radio" name="gender" id="" value="여자"/>여자
	</div>
	<div>
		<button type="submit">보내기</button>
	</div>
</form>
</body>
</html>