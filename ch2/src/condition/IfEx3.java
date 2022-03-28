package condition;

import java.util.Scanner;

// 삼항 연산자로 했던 작업들은 if~else 구조로 변경 가능

public class IfEx3 {
	public static void main(String[] args) {
		// 숫자를 입력받고 양수, 음수 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}		
		
		sc.close();
	}
}









