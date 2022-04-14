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
		if(cmd.equals("/list.do")) {
			action = new BookListAction("/list.jsp");
		}else if(cmd.equals("/insert.do")) {
			action = new BookInsertAction("/list.do");
		}
		
		return action;
	}
	
}
