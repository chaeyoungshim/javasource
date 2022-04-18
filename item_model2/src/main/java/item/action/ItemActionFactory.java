package item.action;

public class ItemActionFactory {
	
	private static ItemActionFactory baf;
	
	private ItemActionFactory() {}
	
	//바로 위 코드 private ItemActionFactory() {} 이렇게 private으로 막았기 때문에 다른 곳에서 호출할 수 있도록 구현은 해야됨 
	//=> 여기 코드처럼 public으로 해서 객체 생성할 수 있도록 도와줌
	public static ItemActionFactory getInstance() {
		if(baf == null) {
			baf = new ItemActionFactory();
		}
		return baf;
	}
	
	Action action = null;
	public Action action(String cmd) { //주소 받기
		//Action 생성 시
		if(cmd.equals("/list.do")) {
			action = new ItemListAction("/list.jsp"); //성공 시 리스트 화면 보여주기
		}else if(cmd.equals("/insert.do")) {
			action = new ItemInsertAction("/list.do");
		}else if(cmd.equals("/delete.do")) {
			action = new ItemDeleteAction("/list.do");
		}else if(cmd.equals("/update.do")) {
			action = new ItemUpdateAction("/list.do");
		}else if(cmd.equals("/search.do")) {
			action = new ItemSearchAction("/list.jsp");
		}
		
		return action;
	}
	
}
