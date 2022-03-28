package extend;

public class Account {
	private String accountNo;
	private String owner;
	private int balance;	
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	int deposit(int amount) {
		balance += amount;
		return balance;  
	}
	
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	
}












