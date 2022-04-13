<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// leaveForm.jsp 에서 보낸 값 가져오기(userid, password)
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password"); //현재 비밀번호
	
	//db 작업(leave())
	Connection con = JdbcUtil.getConnection(); //드라이버 로드
	MemberDAO dao = new MemberDAO(con); //디비 연결
	boolean result = dao.leave(userid, password);
	
	String path = "";
	//탈퇴 성공 - 세션 해제	
	//페이지 이동 - 성공:index.jsp, 실패-leaveForm.jsp
	if(result) {
		JdbcUtil.commit(con);
		session.invalidate();
		path = "/index.jsp"; //index.jsp 는 view에 들어있지 않기 때문에 앞에 제거해줘야 함
	}else {
		JdbcUtil.rollback(con);
		path = "leaveForm.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
%>