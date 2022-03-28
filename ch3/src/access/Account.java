package access;

/* 접근 제한자
 * - 객체 생성을 막아야 하는 경우
 * - 특정 메소드 호출 못하도록 하는 경우
 * - 객체의 속성을 외부에서 함부로 변경하지 못하도록 하는 경우
 * - 종류 : private < default(package) < protected < public
 *        : default : 접근제한자를 안 붙이면 됨
 * 
 * - 클래스의 접근 제한
 * - public(같은 패키지, 다른 패키지), default(같은 패키지)
 * 
 * - 멤버변수의 접근 제한(접근제한자 모두 사용가능)
 * - private : 같은 패키지건 다른 패키지건 상관없이 멤버변수 사용불가
 * -         : 속성의 값 변경을 위해서는 메소드를 통해서만 제공하고
 *             직접적으로 변경하는 것은 허용하지 않기 위해 사용
 */

public class Account {
	//속성 : 계좌번호(111-11-1234), 소유자(홍길동), 잔액(정수)
	private String accountNo;
	private String owner;
	private int balance;	
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	//기능 : 입금한다, 출금한다.
	//입금한다(deposit) : 입금액을 입력받아 현재 잔액에 추가 / 리턴값으로 현재 잔액
	int deposit(int amount) {
		balance += amount;
		return balance;  
	}
	//출금한다(withdraw) : 출금액을 입력받아 현재 잔액에서 감소 / 현재 잔액
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	// getter 메소드
	// private 으로 설정된 변수에 대해서 외부에서 직접 접근은 불가능한 상황임
	// 해당 변수값을 리턴하는 기능
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	//setter 메소드
	//직접 변경하지 말고 메소드를 통해서 변경(매개값의 유효성을 검증한 후 변경)
	public void setAccountNo(String accountNo) {
		//조건 :  숫자4자리-숫자3자리
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}












