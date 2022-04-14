package pattern.action;

public class ActionFactory {
	//SingleTon 객체 생성
	//default 생성자 : private, 다른 생성자는 제공 안함
	//getInstance() 메소드 생성
	
	private static ActionFactory af;
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		if(af == null) {
			af = new ActionFactory();
		}
		return af;
	}
	
	
	Action action = null; //리턴할 것을 부모로 잡기
	public Action action(String cmd) {
		if(cmd.equals("/select.do")) {
			action = new SelectAction(); //
		}else if(cmd.equals("/insert.do")){
			action = new InsertAction();
		}else if(cmd.equals("/login.do")) {
			action = new LoginAction();
		}
		//생성한 action 리턴
		return action;
	}
	
}
