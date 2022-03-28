package interfacetest;

// 인터페이스 : 추상메서드(일반 메서드 사용 불가)
//              추상클래스보다 추상화 정도가 더 높음
//              상수만을 가질 수 있음
//              다른 클래스를 작성하는데 도움 줄 목적으로 작성
//              단, default, static 키워드가 붙은 메소드는 허용

public interface Adder {
	// private int num; 변수 선언 불가
	public static final int SPADE = 1;
	int DIAMOND = 3; // public static final 생략 될 수 있음
	final int HEART = 2;
	static int CLOVER = 4;
	
	// Abstract methods do not specify a body
	//public void print() {}
	
	public void print();
	int add(int x, int y); // public 키워드 생략 가능	
}















