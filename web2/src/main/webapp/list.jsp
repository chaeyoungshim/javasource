<%@page import="web2.dto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page import="web2.dao.MemberDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//커넥션 얻기
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	//전체 member 얻어오기
	List<MemberDTO> list = dao.getList(); // 담긴 list 얻음
%>
<%@ include file="./layout/header.jsp" %>
	<h1>List 페이지</h1>
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">name</th>
	      <th scope="col">addr</th>
	      <th scope="col">email</th>
	      <th scope="col">age</th>
	    </tr>
	  </thead>
	  <tbody>
	   <%-- member 정보 출력 --%>
	   <% for(MemberDTO dto:list) { %>
   		<tr>
   			<td><%= dto.getId() %></td>
   			<td><a href="/readProcess.jsp?id=<%=dto.getId()%>"><%= dto.getName() %></a></td>
   			<td><%= dto.getAddr() %></td>
   			<td><%= dto.getEmail() %></td>
   			<td><%= dto.getAge() %></td>
   		</tr>
	   <% } %>
	  </tbody>
	</table>
<%
	//커넥션 종료
	JdbcUtil.close(con);
%>
<%@ include file="./layout/footer.jsp" %>	












