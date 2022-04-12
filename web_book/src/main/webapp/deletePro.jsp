<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//delete.jsp애서 넘긴 값 가져오기(코드 값)
	int code = Integer.parseInt(request.getParameter("code"));
	
	//db 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	boolean result = dao.delete(code);
	
	//페이지 이동
	//db 작업 성공 시 listPro.jsp 로 이동
	//실패 시 delete.jsp 로 이동
	String path = "";
	if(result) {
		path = "listPro.jsp";
		JdbcUtil.commit(con);
	}else {
		path = "delete.jsp";
		JdbcUtil.rollback(con);
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
%>