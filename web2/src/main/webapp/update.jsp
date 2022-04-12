<%@page import="web2.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./layout/header.jsp" %>
<%
	//request 영역에서 값 가져오기
	MemberDTO dto = (MemberDTO)request.getAttribute("dto"); //modifyProcess.jsp에서 setAttribute했기에 getAttribute 가능
%>
<h1>Update</h1>
<form action="updateProcess.jsp" method="post">
	<div class="form-group row">
		<label for="id" class="col-sm-2 col-form-label">Id</label>
		<div class="col-sm-8">
			<input type="text" name="id" id="id" class="form-control" value="<%=dto.getId()%>" readonly/>
		</div>
	</div>
	<div class="form-group row">
		<label for="name" class="col-sm-2 col-form-label">Name</label>
		<div class="col-sm-8">
			<input type="text" name="name" id="name" class="form-control"value="<%=dto.getName()%>" readonly/>
		</div>
	</div>
	<div class="form-group row">
		<label for="addr" class="col-sm-2 col-form-label">Addr</label>
		<div class="col-sm-8">
			<input type="text" name="addr" id="addr" class="form-control"value="<%=dto.getAddr()%>" />
		</div>
	</div>
	<div class="form-group row">
		<label for="email" class="col-sm-2 col-form-label">Email</label>
		<div class="col-sm-8">
			<input type="text" name="email" id="email" class="form-control" value="<%=dto.getEmail()%>" readonly/>
		</div>
	</div>
	<div class="form-group row">
		<label for="age" class="col-sm-2 col-form-label">Age</label>
		<div class="col-sm-8">
			<input type="text" name="age" id="age" class="form-control" value="<%=dto.getAge()%>" readonly/>
		</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="submit" class="btn btn-primary">수정</button>
			<button type="button" class="btn btn-danger">취소</button>
		</div>
	</div>
</form>
<script src="/js/jquery-3.6.0.min.js"></script>
<script>
	
	//취소 버튼 클릭 시 list.jsp 로 폼 전송
	$(".btn-danger").click(function() {
		location.href = "list.jsp"; //값 전송같은거 하지 않고 단순히 페이지만 이동할거기 때문에
	});
	
</script>
<%@ include file="./layout/footer.jsp" %>















