package op;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		//화씨온도 => 섭씨 온도
		//화씨온도 입력받은 후 섭씨 온도로 변환하기
		//섭씨온도 = (화씨온도 - 32) * 5/9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨 온도 입력 : ");
		int fahr = sc.nextInt();
		
		
		// 5/9 => 몫 (0)
		// 5/9.0 => 
		double celsius = 5/9.0*(fahr-32);
		System.out.println("변환된 섭씨 온도 : "+celsius);	
		//format 지정 : %f(실수형), %d(정수형), %c(문자-''), %s(문자열-"")
		System.out.printf("변환된 섭씨 온도 :%.3f\n",celsius);	
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}












