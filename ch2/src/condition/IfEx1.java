package condition;

/* 조건문
 * 주어진 조건에 따라 다른 문장을 선택할 수 있게 해줌
 * 
 * if(조건식){
 *      수행문;
 * }
 * 
 */
public class IfEx1 {
	public static void main(String[] args) {
		int num = 10;
		
		// num == 0 => 숫자는 0 입니다.
		// num != 0 => 숫자는 0이 아닙니다.
		if(num == 0) {
			System.out.println("숫자는 0 입니다.");
		}
		
//		if(num != 0) {
//			System.out.println("숫자는 0 이 아닙니다.");
//		}
		
		if(num >= 10) {
			System.out.println("숫자는 0 이 아닙니다.");
			System.out.println("등급은 A");
		}
	}
}

















