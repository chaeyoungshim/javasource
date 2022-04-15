<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/layout/header.jsp" %>
<h1>제품 정보 입력</h1>
<form action="/insert.do" method="post">
	<div class="form-group row">
		<label for="code" class="col-sm-2 col-form-label">카테고리</label>
		<div class="col-sm-8">
			<select name="category" id="category" class="form-control">
				<option value="outwear">아웃웨어</option>
				<option value="fulldress">정장/신사복</option>
				<option value="tshirts">티셔츠</option>
				<option value="yshirts">와이셔츠</option>
				<option value="pants">바지</option>
				<option value="shoes">슈즈</option>
			</select>
		</div>
	</div>
	<div class="form-group row">
		<label for="name" class="col-sm-2 col-form-label">상품이름</label>
		<div class="col-sm-8">
			<input type="text" name="name" id="name" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<label for="content" class="col-sm-2 col-form-label">정보</label>
		<div class="col-sm-8">
			<textarea name="content" id="content" cols="30" rows="10" class="form-control"></textarea>
		</div>
	</div>
	<div class="form-group row">
		<label for="psize" class="col-sm-2 col-form-label">사이즈</label>
		<div class="col-sm-8">
			<input type="text" name="psize" id="psize" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<label for="price" class="col-sm-2 col-form-label">가격</label>
		<div class="col-sm-8">
			<input type="text" name="price" id="price" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="submit" class="btn btn-primary">입력</button>
			<button type="reset" class="btn btn-danger">취소</button>
		</div>
	</div>
</form>
<%@ include file="/layout/footer.jsp" %>