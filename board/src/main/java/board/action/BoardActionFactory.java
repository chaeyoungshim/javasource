package board.action;

public class BoardActionFactory {
	
	private static BoardActionFactory baf;
	
	private BoardActionFactory() {}
	
	//바로 위 코드 private ItemActionFactory() {} 이렇게 private으로 막았기 때문에 다른 곳에서 호출할 수 있도록 구현은 해야됨 
	//=> 여기 코드처럼 public으로 해서 객체 생성할 수 있도록 도와줌
	public static BoardActionFactory getInstance() {
		if(baf == null) {
			baf = new BoardActionFactory();
		}
		return baf;
	}
	
	Action action = null;
	public Action action(String cmd) { //주소 받기
		//Action 생성 시
		if(cmd.equals("/qWrite.do")) {
			action = new BoardInsertAction("/qList.do");
		}else if(cmd.equals("/qList.do")) {
			action = new BoardListAction("/view/qna_board_list.jsp");
		}
		
		return action;
	}
	
}
