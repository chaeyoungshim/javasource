package basic;

// 이름을 짓는 규칙
// 클래스명이 두개의 단어로 이루어져 있는 경우 : 각 시작은 대문자로

// 변수 : 메모리 저장공간(무엇을 담을 것이냐에 따라서 타입을 지정)
//      : 담는 값이 변할 수 있음
//      : 정수형(숫자의 크기에 따라서 메모리를 차지하는 공간이 달라짐), 문자형, 실수형, 논리형

public class ByteVariable {
	public static void main(String[] args) {
		// 정수형 : byte
		// 타입 변수명 = 값;
		// byte b1 = 3   (컴파일 에러 - IDE 가 알려줌)
		byte b1 = 3;  //  local variable b1 is not used
		System.out.println(b1); //화면출력
		
		// byte : -128 ~ 127
		
		byte b2 = -128;
		//byte b3 = 128; // Type mismatch: cannot convert from int to byte
		byte b3 = 127;
		
		System.out.println("b2 = "+b2+", b3 = "+b3);		
	}
}






