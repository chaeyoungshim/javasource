package basic;

// 변수 유효 범위
// 변수를 어디서 선언했느냐에 따라 미치는 범위가 다름
// {} : 블록안에서 선언 => 선언된 블록 내에서만 사용이 가능
//  1) 클래스 내부에 선언
//  2) 메소드 내부에 선언

public class VariableScope1 {
	
	// 클래스 내부 선언
	// int age;
	
	public static void main(String[] args) {		
		//메소드 내부에서 선언 - 지역(로컬)변수
		int age = 4;
		int v1 = 3;
		
		{
			v1 = age + 30;
			//int age = 4; // Duplicate local variable age
			int v2 = 45;
			System.out.println("v2 = "+v2);
		}
		System.out.println("v1 = "+v1);
		//System.out.println("v2 = "+v2); // v2 cannot be resolved to a variable
		
	}
	
	public static void print() {
		//System.out.println(age);
	}
	
	
}






