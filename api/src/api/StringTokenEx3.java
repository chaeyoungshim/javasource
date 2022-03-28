package api;


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {
	public static void main(String[] args) {
		// 사용자로부터 문자열을 입력받아 공백으로 분리된 어절이 몇 개인가 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 ");
		// 오늘은 화요일 입니다. => 3
		// exit 문자를 입력하면 반복문 종료
		while(true) {
			System.out.println(">> ");
			String input = sc.nextLine();
			
			if(input.equals("exit")) {
				break;
			}else {
				StringTokenizer st = new StringTokenizer(input);
				System.out.println("공백으로 분리된 어절 수 : "+st.countTokens());
			}
			
		}

	}
}







