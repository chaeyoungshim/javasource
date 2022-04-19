package board.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardUpdateService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardUpdateAction implements Action {

	private String path; //성공 시  /qView.do
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UploadUtil util = new UploadUtil();
		HashMap<String, String> dataMap =util.uploadFile(request); //여기에 값 담겨있음
		
		// dataMap 에서 값 가져오기
		BoardDTO updateDto = new BoardDTO();
		updateDto.setBno(Integer.parseInt(dataMap.get("bno")));
		updateDto.setTitle(dataMap.get("title"));
		updateDto.setContent(dataMap.get("content"));
		updateDto.setPassword(dataMap.get("password"));
		updateDto.setAttach(dataMap.get("attach")); // 파일첨부를 했다면 값이 들어와 있고, 안했다면 null
		
		
		//서비스 호출 후 디비 작업
		BoardUpdateService service = new BoardUpdateService();
		
		//페이지 이동 => 성공 /qView.do , 실패/qModify.do
		if(!service.update(updateDto)) {
			path = "/qModify.do?bno="+updateDto.getBno(); //널포인트이셉션 일어나지 않게 bno 보내주기
		}else {
			path += "?bno="+updateDto.getBno(); //잘 수정됐는지 보여주고 싶어서, /qView.do?bno=3 이런 식으로 전송
		}
		return new ActionForward(path, true); //아무것도 안 담았으니까 true 방식으로
	}

}
