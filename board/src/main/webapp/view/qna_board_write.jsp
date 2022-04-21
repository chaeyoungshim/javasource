<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@include file="../include/header.jsp"%>
<!-- Main content -->
<% request.setCharacterEncoding("utf-8"); %>
<section class="content">
  <div class="box box-primary">
    <div class="box-header">
      <h3 class="box-title">Board Write</h3>
    </div>
    <div style="height:20px"></div>
    <%-- enctype : multipart/form-data --%>
    <form action="/qWrite.do" method="post" role="form" id="writeForm" enctype="multipart/form-data">
      <div class="box-body">
        <div class="form-group row">
          <label for="name" class="col-sm-2 col-form-label">작성자</label>
          <div class="col-sm-10">
            <input
              type="text"
              name="name"
              id="name"
              size="10"
              class="form-control"
              maxlength="10"
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="title" class="col-sm-2 col-form-label">제목</label>
          <div class="col-sm-10">
            <input
              type="text"
              name="title"
              id="title"
              size="50"
              class="form-control"
              maxlength="100"
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="content" class="col-sm-2 col-form-label">내용</label>
          <div class="col-sm-10">
            <textarea
              name="content"
              id="content"
              cols="60"
              class="form-control"
              rows="15"
            ></textarea>
          </div>
        </div>
        <div class="form-group row">
          <label for="password" class="col-sm-2 col-form-label">비밀번호</label>
          <div class="col-sm-10">
            <input
              type="password"
              name="password"
              id="password"
              class="form-control"
              size="10"
              maxlength="10"
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="file" class="col-sm-2 col-form-label">파일첨부</label>
          <div class="col-sm-10">
            <input type="file" name="attach" id="file" />
            <small class="text-muted" id="file">(파일크기 : 2MB)</small>
          </div>
        </div>
        <div style="height:20px"></div>
        <div class="form-group text-center">
          <button type="submit" class="btn btn-primary">등록</button>
          <button type="reset" class="btn btn-danger">다시작성</button>
          <button type="button" class="btn btn-warning" id="list">
            목록보기
          </button>
        </div>
        <div style="height:20px"></div>
      </div>
      <!-- 페이지 나누기 후 추가 -->
      <input type="hidden" name="page" value="1" /> <!-- 페이지는 1로 설정, 앞에 페이지 보여주면 되니까 -->
	  <input type="hidden" name="amount" value="<%= request.getParameter("amount") %>" />
	  <input type="hidden" name="criteria" value="" />
	  <input type="hidden" name="keyword" value="" />
    </form>
  </div>
  <!-- /.box -->
</section>
<form action="/qList.do" id="actionForm">
	 <input type="hidden" name="page" value="<%= request.getParameter("page") %>" />
	 <input type="hidden" name="amount" value="<%= request.getParameter("amount") %>" />
	 <input type="hidden" name="criteria" value="<%= request.getParameter("criteria") %>" />
	 <input type="hidden" name="keyword" value="<%= request.getParameter("keyword") %>" />
</form>
<script src="/js/write.js"></script>
<%-- write form validate --%>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/additional-methods.min.js"></script>
<script src="/js/write_validate.js"></script>
<%@include file="../include/footer.jsp"%>















