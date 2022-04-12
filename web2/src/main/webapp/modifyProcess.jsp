<%@page import="web2.dto.MemberDTO"%>
<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//폼에서 넘긴 id 값 가져오기
	int id = Integer.parseInt(request.getParameter("id"));
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	MemberDAO dao = new MemberDAO(con); //디비 연결
	
	MemberDTO dto = dao.getRow(id); //한 번 더 불러와야 하기 때문에
	
	request.setAttribute("dto", dto); //그냥 페이지 이동하지 말고 한 번 담고 가기
	
	//페이지 이동 => request 하고 페이지 이동 시에는 무조건 forward 사용하기!!!!
	pageContext.forward("/update.jsp"); 
	
%>