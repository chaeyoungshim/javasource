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
		//form submit()
		$("#search").submit();
	})
	
	//페이지 나누기 이동
	//페이지 나누기 정보를 가지고 있는 폼 가져오기
	let actionForm = $("#actionForm");
	
	//1234  혹은 이전 , 다음 이 클릭되면 actionForm 보내기
	$(".page-link").click(function(e){
		//a태그 기능 중지
		e.preventDefault();
		
		//a태그의 href 속성이 가지고 있는 값 가져오기
		let page = $(this).attr("href");
		//actionForm 안의 page 번호를 교체
		actionForm.find("[name='page']").val(page);
		
		//console.log(page);
		//actionForm 보내기
		actionForm.submit();
	})
	
	
	
})




















