package book.action;

public class BookActionFactory {
	
	private static BookActionFactory baf;
	
	private BookActionFactory() {}
	
	public static BookActionFactory getInstance() {
		if(baf == null) {
			baf = new BookActionFactory();
		}
		return baf;
	}
	
	Action action = null;
	public Action action(String cmd) {
		//Action 생성 시
		// 만약 성공 시 /list.do 로 이동해서 보여주기
		if(cmd.equals("/list.do")) {
			action = new BookListAction("/list.jsp");
		}else if(cmd.equals("/insert.do")) {
			action = new BookInsertAction("/list.do");
		}else if(cmd.equals("/delete.do")) {
			action = new BookDeleteAction("/list.do");
		}else if(cmd.equals("/update.do")) {
			action = new BookUpdateAction("/list.do");
		}else if(cmd.equals("/search.do")) {
			action = new BookSearchAction("/list.jsp"); //do 로 가면 search에서 하던 부분이 사라지고 list.do를 실행해서 없어짐
		}
		
		return action;
	}
	
}
