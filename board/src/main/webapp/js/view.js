/**
 *  qna_board_view.jsp 스크립트
 */
$(function(){
	$("#list").click(function(){
		location.href = "/qList.do"
	})
	
 	let formObj = $("#actionForm");

	$("#delete").click(function(){
	
		//폼 action 지정
		formObj.attr("action","/view/qna_board_pwdCheck.jsp");
		//submit
		formObj.submit();
	})
	
	$("#modify").click(function(){
		//폼 action 지정
		formObj.attr("action","/qModify.do");
		//submit
		formObj.submit();
	})
})