<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/layout/header.jsp" %>
<%-- 화면 위치 --%>
<h1>제품 목록 보기</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">카테고리</th>
      <th scope="col">상품명</th>
      <th scope="col">사이즈</th>
      <th scope="col">가격</th>
      <th scope="col">등록일자</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="dto" items="${list}">
   		<tr>
   			<td>${dto.num}</td>
   			<td>${dto.category}</td>
   			<td>${dto.name}</td>
   			<td>${dto.psize}</td>
   			<td>${dto.price}</td>
   			<td>${dto.registerAt}</td>
   		</tr>
   </c:forEach>
  </tbody>
</table>
<%@ include file="/layout/footer.jsp" %>