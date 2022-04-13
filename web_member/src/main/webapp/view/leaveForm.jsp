<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<%
	//세션에서 로그인 정보 가져오기	
	MemberDTO loginDto = (MemberDTO)session.getAttribute("loginDto");
%>
<form id="leaveform" action="leavePro.jsp" method="post">
	<div class="card"  style="width: 40rem;margin:40px auto;">	
		<div class="card-header">
	    	<h4>회원탈퇴</h4>
	  	</div>
	 	<div class="card-body">	
			<div class="form-group row justify-content-center">		
				<div class="col-sm-10">	
					<input type="text" name="userid" id="userid" class="form-control" value="<%=loginDto.getUserid()%>" readonly/>
			 		<small id="userid" class="text-info"></small>		
				</div>
			</div>	
			<div class="form-group row justify-content-center">		
				<div class="col-sm-10">	
					<input type="password" name="current_password" id = "current_password" class="form-control" placeholder="비밀번호" autofocus="autofocus"/>
					<small id="current_password" class="text-info"></small>
				</div>	
			</div>				
			<div class="form-group text-center">		
				<button type="submit" class="btn btn-primary">탈퇴</button>
			    <button type="button" class="btn btn-secondary" id="leavecancel">취소</button>		
			</div>
		</div>
	</div>		
</form>
<%--로그인 후 메뉴 --%>
<script>
	let name = '<%= loginDto.getName() %>';
</script>
<script src="/js/menu.js"></script>
<%-- 정보수정 들어왔으니 정보수정 버튼 없애기 --%>
<script>
$(function() {
	$("#leave").detach();
})
</script>
<%@ include file="../layout/footer.jsp" %>