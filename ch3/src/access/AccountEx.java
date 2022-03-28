package access;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("111-22", "홍길동", 10000);
				
		System.out.println("계좌번호 : "+account.getAccountNo());
		System.out.println("계좌주 : "+account.getOwner());
		System.out.println("잔액 : "+account.getBalance());
	}
}
