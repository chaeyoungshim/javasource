<%@page import="book.dto.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//도서 목록 전체 조회 후 화면 이동 => 값을 가져올게 없고 단순히 조회일 뿐이라 바로 db 작업 처리
	//db 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	List<BookDTO> list = dao.getlist();
	
	//페이지 이동
	request.setAttribute("list", list);
	pageContext.forward("list.jsp"); //request이기 때문에 무조건 forward로 처리
%>