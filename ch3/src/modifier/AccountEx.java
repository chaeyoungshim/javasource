package modifier;

//import : 다른 패키지에 있는 클래스를 사용할 때 필요
//       : 자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능
import classtest.Account;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(null, null, 0);
		House house = new House();
	}
}
