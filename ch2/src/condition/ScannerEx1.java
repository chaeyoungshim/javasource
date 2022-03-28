package condition;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력 >> ");
		int num2 = sc.nextInt();
		
		System.out.printf("입력한 숫자의 덧셈 결과는 %d",(num1+num2));

	}
}











