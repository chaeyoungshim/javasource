package exception;

public class Account {
	//속성 : 계좌번호(111-11-1234), 소유자(홍길동), 잔액(정수)
	String accountNo;
	String owner;
	int balance;	
	
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
//	int withdraw(int amount) throws BalanceInsufficientException {
//		if(balance < amount) {
//			//예외 강제 발생			
//			throw new BalanceInsufficientException("잔고부족 : "+(amount-balance)+" 부족");
//		}
//		balance -= amount;
//		return balance;
//	}
	
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			//예외 강제 발생			
			throw new Exception("잔고부족 : "+(amount-balance)+" 부족");
		}
		balance -= amount;
		return balance;
	}
}












