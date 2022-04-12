<%@page import="book.dto.BookDTO"%>
<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
	request.setCharacterEncoding("utf-8");

	//insert.jsp에서 넘어오는 값 가져오기(BookDTO)
	BookDTO dto = new BookDTO();
	dto.setCode(Integer.parseInt(request.getParameter("code")));
	dto.setTitle(request.getParameter("title"));
	dto.setWriter(request.getParameter("writer"));
	dto.setPrice(Integer.parseInt(request.getParameter("price")));
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	BookDAO dao = new BookDAO(con); //디비 연결
	boolean result = dao.insert(dto);
	
	//페이지 이동
	String path = "";
	if(result) {
		JdbcUtil.commit(con);
		path = "listPro.jsp";
	}else {
		JdbcUtil.rollback(con);
		path = "insert.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
	
%>