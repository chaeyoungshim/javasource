package condition;

import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {
	
	// 조건식에 맞지 않으면 반복 수행이 한번도 안됨	
	// for(int i=10;i<1;i--) {}, while()	
		
		
	// 조건이 만족하는지를 마지막에 검사하기 때문에 한 번은 수행됨	
//		do {
//			수행문1;
//		}while(조건);
		
		// 1~100 사이의 임의의 숫자 맞추기
		
		int answer = (int)(Math.random()*100)+1; 
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("1 ~ 100 사이의 정수 입력");
			input = sc.nextInt();
			
			if(answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(answer == input) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("더 큰 수를 입력하세요");
			}
			
		}while(input != answer);
		
		System.out.println("프로그램 종료");
		
		sc.close();

	}
}
















