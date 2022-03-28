package exam;

public class AccountEx1 {
	public static void main(String[] args) {
		Account1 account = new Account1();
		
		account.setBalance(1000);
		System.out.println("현재 잔액 : "+account.getBalance());
		
		account.setBalance(-1000);
		System.out.println("현재 잔액 : "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔액 : "+account.getBalance());

	}
}
