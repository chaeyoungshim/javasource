<%@page import="book.dto.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	

	//search.jsp 에서 넘긴 값 가져오기 => select 가져오기(criteria)
	String criteria = request.getParameter("criteria"); //자동으로 option 값 선택에 따라 가져옴(code 혹은 writer)
	String keyword = request.getParameter("keyword"); //1004 or 홍길동 
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	BookDAO dao = new BookDAO(con); //디비 연결
	List<BookDTO> list = dao.searchList(criteria, keyword);
	
	JdbcUtil.close(con);
	//페이지 이동
	//list.jsp 로 이동  => list 로 setAttribute 하기
	request.setAttribute("list", list);
	pageContext.forward("list.jsp"); //request이기 때문에 무조건 forward로 처리
%>