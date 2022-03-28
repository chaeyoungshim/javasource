package extend;

public class BonusPointAccount extends Account {
	
	//보너스 포인트
	private int bounsPoint;
	
	
	public BonusPointAccount(String accountNo, String owner, int balance,int bonusPoint) {
		super(accountNo, owner, balance);
		this.bounsPoint = bonusPoint;
	}
	
	@Override
	int deposit(int amount) {
		//예금
		super.deposit(amount);
		//보너스포인트=예금액 * 0.1%
		bounsPoint += (int)(amount*0.001);
		return bounsPoint;
	}
	
	public int getBounsPoint() {
		return bounsPoint;
	}

}


















