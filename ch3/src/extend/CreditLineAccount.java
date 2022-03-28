package extend;

public class CreditLineAccount extends Account {

	//마이너스 한도 : creditLine
	private int creditLine;
	
	public CreditLineAccount(String accountNo, String owner, int balance,int creditLine) {
		super(accountNo, owner, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	int withdraw(int amount) {
		// 잔액 = 잔액 + 마이너스 한도
		// 사용액 amount 보다 잔액이 작은지 확인
		if(getBalance()+creditLine < amount) {
			System.out.println("잔액 부족");
			return -1;
		}
		// 차감이 가능하다면 잔액 - 사용액 
		setBalance(getBalance()-amount);
		// 리턴 값 잔액
		return super.getBalance();
	}

}













