package access;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();		
		System.out.println(obj1 == obj2);
		
		Account account1 = new Account("111-22", "홍길동", 10000);
		Account account2 = new Account("111-23", "김길동", 10000);
		System.out.println(account1 ==  account2);

	}
}
