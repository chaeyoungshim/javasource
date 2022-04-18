<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/layout/header.jsp" %>
<%-- 화면 위치 --%>
<h1>제품 정보 검색</h1>
<form action="/search.do" method="post">
	<div class="form-row">
		<div class="form-group col-md-6">
			<select name="category" id="category" class="form-control">
				<option value="outwear">아웃웨어</option>
				<option value="fulldress">정장/신사복</option>
				<option value="tshirts">티셔츠</option>
				<option value="yshirts">와이셔츠</option>
				<option value="pants">바지</option>
				<option value="shoes">슈즈</option>
			</select>
		</div>
		<div class="form-group col-md-6">
			<input type="text" name="name" id="name" class="form-control"/>
		</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="submit" class="btn btn-primary">검색</button>
			<button type="reset" class="btn btn-danger">취소</button>
		</div>
	</div>
</form>
<%@ include file="/layout/footer.jsp" %>