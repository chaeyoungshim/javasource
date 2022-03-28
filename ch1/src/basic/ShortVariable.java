package basic;

// 정수형 - 1. byte
//          2. short

public class ShortVariable {
	public static void main(String[] args) {
		// short : 2byte 사용
		// -32768 ~ 32767
		short s1 = 200;
		s1 = 350;
		// + : 연결(변수 앞,뒤쪽으로 문자열("")이 존재하는 경우)
		System.out.println("s1 = "+s1);
		
		byte b1 = 12;
		short s2 = 25;
		// + : 산술연산
		
		//short result = b1 + s2;
		
		System.out.println(b1 + s2);
		
	}
}





