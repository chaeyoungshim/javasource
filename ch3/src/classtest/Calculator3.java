package classtest;

public class Calculator3 {
	long a, b; //인스턴스 변수(멤버변수)
	
	//멤버메소드(인스턴스 메소드)
	long add() {
		return a+b;
	}
	long subtract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	double divide() {
		return a/b;
	}
	
	//클래스 메소드
	//공유,객체 생성없이 사용 가능
	//인스턴스 변수, 인스턴스 메소드 사용 불가
//	static long add2() {
//		// Cannot make a static reference to the non-static field a
//		//return a + b;
//		//add();
//	}
	
	static long add(long c, long d) {
		return c+d;
	}
	static long subtract(long c, long d) {
		return c-d;
	}
	static long multiply(long c, long d) {
		return c*d;
	}
	static double divide(long c, long d) {
		return c/d;
	}
}







