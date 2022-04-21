/**
 *  qna_board_view.jsp 스크립트
 */
$(function(){
 	let formObj = $("#actionForm");


	$("#list").click(function(){
		formObj.attr("action","/qList.do");
		formObj.submit();
	})
	

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
	$("#reply").click(function(){
		//폼 action 지정
		formObj.attr("action","/qReplyView.do");
		//submit
		formObj.submit();
	})
})