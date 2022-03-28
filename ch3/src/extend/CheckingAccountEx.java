package extend;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount account1 = new CheckingAccount("111-11", "홍길동", 20000, "5555-55");
		CheckingAccount account2 = new CheckingAccount("222-22", "성춘향", 50000, "3333-33");
		
		//예금
		account1.deposit(30000);
		//현재 잔액
		System.out.println(account1.getOwner()+" 님 잔액 : "+account1.getBalance());
		//체크카드 사용
		account1.pay("5555-55", 20000);
		//체크카드 사용 후 현재 잔액
		System.out.println(account1.getOwner()+" 님 잔액 : "+account1.getBalance());
		
		System.out.println();
		
		//출금
		account2.withdraw(30000);
		//카드 사용
		account2.pay("7777-77", 10000);
		//체크카드 사용 후 현재 잔액
		System.out.println(account2.getOwner()+" 님 잔액 : "+account2.getBalance());
	}
}












