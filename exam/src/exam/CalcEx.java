package exam;

import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//두 개 숫자 입력받기
		System.out.print("Input Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Num1 : ");
		int num2 = sc.nextInt();
		
		//input = sc.nextLine();
		
		System.out.println("Input operator : ");
		String op = sc.nextLine(); 
		
		Add add = new Add();
		
		
		
		
		
		if(op == "+") {
			add.setValue(num1, num2);
		}
		
	}
	
}
