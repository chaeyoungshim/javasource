<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./layout/header.jsp" %>
<h1>insert</h1>
<form action="insertProcess.jsp" method="post">
	<div class="form-group row">
		<label for="name" class="col-sm-2 col-form-label">Name</label>
		<div class="col-sm-8">
			<input type="text" name="name" id="name" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<label for="addr" class="col-sm-2 col-form-label">Addr</label>
		<div class="col-sm-8">
			<input type="text" name="addr" id="addr" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<label for="email" class="col-sm-2 col-form-label">Email</label>
		<div class="col-sm-8">
			<input type="text" name="email" id="email" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<label for="age" class="col-sm-2 col-form-label">Age</label>
		<div class="col-sm-8">
			<input type="text" name="age" id="age" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="submit" class="btn btn-primary">입력</button>
			<button type="reset" class="btn btn-danger">취소</button>
		</div>
	</div>
</form>
<%@ include file="./layout/footer.jsp" %>