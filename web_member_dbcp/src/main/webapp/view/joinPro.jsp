<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	
	request.setCharacterEncoding("utf-8");

	//joinForm.jsp 에서 넘긴 값 가져오기
	MemberDTO registerDto = new MemberDTO();
	registerDto.setUserid(request.getParameter("userid"));
	registerDto.setPassword(request.getParameter("password"));
	registerDto.setName(request.getParameter("name"));
	registerDto.setGender(request.getParameter("gender"));
	registerDto.setEmail(request.getParameter("email"));
	
	String confirmPassword = request.getParameter("confirm_password");//얜 따로 받기
	
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	String path = "";
	
	//db 작업(register()) => MemberDTO에 담아서 한꺼번에 작업하기
	if(confirmPassword.equals(registerDto.getPassword())) {
		if(dao.register(registerDto)) {
		//페이지 이동 : 성공-loginForm.jsp , 실패-joinForm.jsp
			JdbcUtil.commit(con);
			path = "loginForm.jsp";
		}else {
			JdbcUtil.rollback(con);
			path = "joinForm.jsp";
		}
	}
	
	JdbcUtil.close(con);
	response.sendRedirect(path);
%>