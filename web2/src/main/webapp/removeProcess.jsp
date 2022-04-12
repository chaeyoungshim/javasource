<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="web2.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 폼에서 보낸 값 가져오기 => id 가져오기
	int id = Integer.parseInt(request.getParameter("id"));
	
	//db 작업
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	MemberDAO dao = new MemberDAO(con); //디비 연결
	
	boolean result = dao.delete(id); //삭제하기
	
	//페이지 이동
	String path = "";
	if(result) {
		JdbcUtil.commit(con); //성공 시 커밋
		path = "list.jsp"; //다시 리스트 페이지로 이동
	}else {
		JdbcUtil.rollback(con); //실패 시 롤백
		path = "readProcess.jsp?id="+id; //만일 실패 시 read.jsp로 설정하면 500 에러 뜸=>readProcess.jsp로 해야함(이래도 에러나긴함)
	}
	response.sendRedirect(path); //이동
	
	JdbcUtil.close(con); //연결 닫기
%>