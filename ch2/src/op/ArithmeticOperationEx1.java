package op;

public class ArithmeticOperationEx1 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		
		int result  = v1 + v2;
		System.out.println("v1 + v2 = "+result);
		
		result  = v1 - v2;
		System.out.println("v1 - v2 = "+result);
		
		result  = v1 * v2;
		System.out.println("v1 * v2 = "+result);
		
		result  = v1 / v2;  //몫
		System.out.println("v1 / v2 = "+result);
		
		result  = v1 % v2;  //나머지
		System.out.println("v1 % v2 = "+result);
		
		
		double result2=(double)v1 / v2;
		System.out.println("(double)v1 / v2 = "+result2);
		

	}
}






