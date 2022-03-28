package condition;

import java.util.Scanner;

/* if(조건){}
 * if(조건){}else{}
 * if(조건){}else if(조건){}else{}
 * 
 * if(조건){
 *    if(조건){
 *    
 *    }else{
 *    
 *    }
 * }
 */
public class IfEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 : ");
		int score = sc.nextInt();
		
		// 공백 : 문자
		char opt=' ', grade = ' ';
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt='+';
			}else {
				opt='-';
			}
		}else if(score >= 80) {
			grade = 'B';

			if(score >= 88) {
				opt='+';
			}else {
				opt='-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c 입니다.",grade,opt);
		System.out.println("당신의 학점은 "+grade+opt+" 입니다.");

	}
}
















