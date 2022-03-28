package condition;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		// 숫자 입력받은 후 짝수, 홀수 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

	}
}

















