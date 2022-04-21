package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardReplyService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReplyAction implements Action {
	
	private String path; //성공 시 qList.do

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//qna_board_reply.jsp 에서 넘기는 값 가져오기(댓글+원본글의 re~~~)
		
		BoardDTO replyDto = new BoardDTO();
		//댓글
		replyDto.setTitle(request.getParameter("title"));
		replyDto.setContent( request.getParameter("content"));
		replyDto.setName(request.getParameter("name"));
		replyDto.setPassword(request.getParameter("password"));
		
		//원본글
		int bno = Integer.parseInt(request.getParameter("bno"));
		replyDto.setReLev(Integer.parseInt(request.getParameter("re_lev")));
		replyDto.setReSeq(Integer.parseInt(request.getParameter("re_seq")));
		replyDto.setReRef(Integer.parseInt(request.getParameter("re_ref")));
		
		//페이지 나누기
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"),"utf-8");
		
		
		BoardReplyService service = new BoardReplyService();
		
		if(!service.reply(replyDto)) {
			path = "/qReplyView.do?bno="+bno+"&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;
		}else {
			path += "?page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;
		}
		
		
		return new ActionForward(path, true); //담을거 없으니까 true
	}

}
