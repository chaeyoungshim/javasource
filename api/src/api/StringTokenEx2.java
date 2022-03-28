package api;


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx2 {
	public static void main(String[] args) {
		// 사용자로부터 문자열을 입력받은 후 구분해서 출력
		// 예시) 아빠/엄마/수연/철수/영희 
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요");
		String input = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}


















