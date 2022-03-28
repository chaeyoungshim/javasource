package op;

import java.util.Scanner;

// System.out : 모니터


public class ScannerEx1 {
	public static void main(String[] args) {
		//키보드(System.in)에서 입력을 받고 싶을 때
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 ");
		//sc.nextInt() : 사용자한테 숫자를 입력받는 부분(문자 입력시 exception 발생)
		int num = sc.nextInt();
		
		System.out.println("입력한 숫자는 "+ num);
		
		sc.close();
	}
}











