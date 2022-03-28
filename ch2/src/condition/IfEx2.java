package condition;

/* if(조건문){
 * 
 * }else{ 조건이 거짓일 때
 * 
 * }
 * 
 */
public class IfEx2 {
	public static void main(String[] args) {
		int score = 90;
		
		// score 가 90이상이면 메세지 출력
		// score 가 90 미만이면 메세지 출력
		
//		if(score >= 90) {
//			
//		}
//		if(score < 90) {
//			
//		}
			
		if(score >= 90) {
			System.out.println("점수는 90이상입니다.");
			System.out.println("등급은 A 입니다.");
		}else {
			System.out.println("점수는 90 미만입니다.");
			System.out.println("등급은 B 입니다.");
		}
		

	}

}















