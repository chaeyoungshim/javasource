package classtest;

public class CalculatorEx3 {

	public static void main(String[] args) {
		Calculator3 cal = new Calculator3();
		
		cal.a = 10;
		cal.b = 5;
		
		System.out.println("a + b = "+cal.add());
		System.out.println("a - b = "+cal.subtract());
		System.out.println("a * b = "+cal.multiply());
		System.out.println("a / b = "+cal.divide());

		//클래스 메소드 호출
		System.out.println("a + b = "+Calculator3.add(10, 5));
		System.out.println("a - b = "+Calculator3.subtract(10, 5));
		System.out.println("a * b = "+Calculator3.multiply(10, 5));
		System.out.println("a / b = "+Calculator3.divide(10, 5));
		
	}

}










