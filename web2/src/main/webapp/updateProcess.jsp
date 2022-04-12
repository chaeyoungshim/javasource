<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	//폼에서 넘긴 값 가져오기(id, addr만 가져오면 됨)
	int id = Integer.parseInt(request.getParameter("id"));
	String addr = request.getParameter("addr");
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	MemberDAO dao = new MemberDAO(con); //디비 연결
	boolean result = dao.update(id, addr); //수정 메소드 호출
	
	
	//페이지 이동
	String path = "";
	if(result) {
		JdbcUtil.commit(con);
		path = "list.jsp"; //성공 시 list.jsp 로 이동
	}else {
		JdbcUtil.rollback(con);
		path = "modifyProcess.jsp"; //forward 때문에 주소줄에 뜨는 주소로 이동하기
	}
	JdbcUtil.close(con); //수정 작업 끝났으면 연결 끊어주기
	
	response.sendRedirect(path); //해당 페이지로 응답하기
	
%>