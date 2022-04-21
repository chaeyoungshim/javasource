/**
 * qna_board_list.jsp 스크립트
 */
$(function(){
	
	
	
	
	
	//text 에 엔터 금지
	$(":text").keydown(function(e){ //모든 텍스트 막기
		if(e.keyCode == 13) { //엔터 키 코드 13
			e.preventDefault(); //이벤트 모두 막기
		}
	})
	
	
	$(".btn-primary").click(function(){
		//criteria 가 value 가 n 이면 경고 메세지
		if($("[name='criteria']").val() == "n") {
			alert('검색 조건이 없습니다.');
			return false; //가지 말고 돌려보내야됨 => 밑에 submit()이 있기 때문에 return을 해주지 않으면 바로 submit으로 감.
						  //또한 밑에 submit이 없다고 해도 반환하지 않으면 list.jsp에서 밑에 코드들을 수행할 수 없기 때문에
		}
		//keyword 도 비어있으면 경고메세지
		if($("[name='keyword']").val() == "") {
			alert('검색어가 없습니다.');
			return false; //가지 말고 돌려보내야됨
		}
		//page 번호를 변경해서 보내야함 => 검색 시 무조건 1페이지부터 봐야하기 때문에
		//검색 후 페이지는 항상 1 이어야 해서 => 첫 장부터 봐야 하니까
		$("#search").find("[name='page']").val("1"); //1로 셋팅
		
		//form submit()
		$("#search").submit();
	})
	
	//페이지 나누기 이동
	
	//페이지 나누기 정보를 가지고 있는 폼 가져오기
	let actionForm = $("#actionForm");
	
	
	//글 제목 클릭 시 actionForm 보내기
	$(".move").click(function(e){
		//a태그 기능 중지
		e.preventDefault();
		
		//href 에 있는 값을 가져온 후 actionForm 안의 bno값을 변경
		let bno  = $(this).attr("href");
		actionForm.append("<input type='hidden' name='bno' value='"+ bno +"' />");
		//actionForm 의 action 새로 지정 => /qHitUpdate.do
		actionForm.attr("action","/qHitUpdate.do");
		//actionForm 을 submit()
		actionForm.submit();
	})
	
	//1234  혹은 이전 , 다음 이 클릭되면 actionForm 보내기
	$(".page-link").click(function(e){
		//a태그 기능 중지
		e.preventDefault();
		
		//a태그의 href 속성이 가지고 있는 값 가져오기
		let page = $(this).attr("href");
		
		if(totalPage < page) {
			page = totalPage;
		}
		//actionForm 안의 page 번호를 교체
		actionForm.find("[name='page']").val(page);
		
		actionForm.find("[name='bno']").remove();
		
		
		//console.log(page);
		//actionForm 보내기
		actionForm.attr("action","/qList.do");
		actionForm.submit();
	})
	
	
	// 새 글 작성 시 페이지 나누기 정보 보내기
	$(".btn-success").click(function(){
		actionForm.attr("action","/view/qna_board_write.jsp");
		actionForm.attr("method","post");
		actionForm.submit();
	})
	
})




















