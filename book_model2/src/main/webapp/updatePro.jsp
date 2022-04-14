<%@page import="book.dto.BookDTO"%>
<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//update.jsp 에서 값 가져오기(code, price)
	int code = Integer.parseInt(request.getParameter("code"));
	int price = Integer.parseInt(request.getParameter("price"));
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	BookDAO dao = new BookDAO(con); //디비 연결
	boolean result = dao.update(code, price);
	
	//페이지 이동
	String path = "";
	if(result) {
		path = "listPro.jsp";
		JdbcUtil.commit(con);
	}else {
		path = "update.jsp";
		JdbcUtil.rollback(con);
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);

%>