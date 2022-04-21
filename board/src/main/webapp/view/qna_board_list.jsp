<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
	<div class="box box-primary">
		<div class="box-header">
			<h3 class="box-title">List Board</h3>
		</div>
		<div class="row">
			<div class="col-md-4">
				<button type="button" class="btn btn-success">글쓰기</button>
			</div><!--글쓰기 버튼-->
			<div class="col-md-4 offset-md-4"><!--검색 들어갈 부분-->
				<form action="/qList.do" method="get" id="search">
					<input type="hidden" name="page" value="${pageDto.searchDto.page}" />
					<input type="hidden" name="amount" value="${pageDto.searchDto.amount}" />
					<select name="criteria" id="">
						<option value="n" <c:out value="${pageDto.searchDto.criteria == null?'selected':''}" />>---------</option>
						<option value="title" <c:out value="${pageDto.searchDto.criteria == 'title'?'selected':''}" />>title</option>
						<option value="content" <c:out value="${pageDto.searchDto.criteria == 'content'?'selected':''}" />>content</option>
						<option value="name" <c:out value="${pageDto.searchDto.criteria == 'name'?'selected':''}" />>name</option>
					</select> <!-- 여기는 서치 부분 -->
					<input type="text" name="keyword" id="" value="${pageDto.searchDto.keyword}"/>
					<input type="button" value="검색" class="btn btn-primary"/>
				</form>
			</div>
		</div>
		<br>
		<table class="table table-bordered">
			<tr>
				<th class='text-center' style='width:100px'>번호</th>
				<th class='text-center'>제목</th>
				<th class='text-center'>작성자</th>
				<th class='text-center'>날짜</th>
				<th class='text-center' style='width:100px'>조회수</th>
			</tr>
			<c:forEach var="dto" items="${list}">
				<tr><!-- 리스트 목록 보여주기 -->
					<td class='text-center'>${dto.bno}</td><!--번호-->
					<td><!--제목-->
						<c:if test="${dto.reLev != 0}"> <!-- reLev가 값을 가지고 있다면, 댓글 있는 애들만 -->
							<c:forEach begin="0" end="${dto.reLev*1}">
								&nbsp; <%-- 공백 --%>
							</c:forEach>
						</c:if>
						<a href="${dto.bno}" class="move">${dto.title}</a>
					</td>
					<td class='text-center'>${dto.name}</td><!--작성자-->
					<td class='text-center'>${dto.regDate}</td><!--날짜-->
					<td class='text-center'><span class="badge badge-pill badge-primary">${dto.readCount}</span></td>
				</tr>	
			</c:forEach>	
		</table>
		<div class="container">
			<div class="row  justify-content-md-center">
				<nav aria-label="Page navigation example">
				  <ul class="pagination"><!--하단의 페이지 나누기 부분-->
				  	<c:if test="${pageDto.prev}">
						<li class="page-item"><a href="${pageDto.searchDto.page-10}" class="page-link">이전</a></li>
					</c:if>
					
					<c:forEach begin="${pageDto.startPage}" end="${pageDto.endPage}" var="idx">
						<li class="page-item ${pageDto.searchDto.page == idx?'active':''}">
							<a href="${idx}" class="page-link">${idx}</a>
						</li>
					</c:forEach>
					<c:if test="${pageDto.next}">
						<li class="page-item"><a href="${pageDto.searchDto.page+10}" class="page-link">다음</a></li>
					</c:if>
				  </ul>
				</nav>					
			</div>
		</div>
		<div style="height:20px"></div>
	</div>	
</section>
<!-- 페이지 나누기 정보 폼 : 사용자가 요청한 페이지 번호, 한 페이지에 보여줄 게시물 개수 -->
<form action="" id="actionForm">
	<input type="hidden" name="page" value="${pageDto.searchDto.page}" />
	<input type="hidden" name="amount" value="${pageDto.searchDto.amount}" />
	<input type="hidden" name="criteria" value="${pageDto.searchDto.criteria}" />
	<input type="hidden" name="keyword" value="${pageDto.searchDto.keyword}" />
</form>
<script>
	let totalPage = ${pageDto.totalPage};
</script>
<script src="/js/list.js"></script> 
<%@include file="../include/footer.jsp"%>
























