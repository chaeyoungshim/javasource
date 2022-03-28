package classtest;

public class AccountEx {
	public static void main(String[] args) {
		Account account1 = new Account("111-11-123","홍길동",10000);
		//계좌출금
		System.out.println(account1.owner+" 현재 잔액 : "+account1.withdraw(5000));
		
		Account account2 = new Account("222-11-123","성춘향",20000);
		//계좌입금
		System.out.println(account2.owner+" 현재 잔액 : "+account2.deposit(100000));
	}
}
