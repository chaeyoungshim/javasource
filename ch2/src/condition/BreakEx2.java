package condition;

// break; 반복문 수행 중지
// while(조건식){ .... break;  }
// while(조건식){
//   while(조건식){
//
//  	break; 내부 반복문만 빠져나감
//
//   }
// }


public class BreakEx2 {
	public static void main(String[] args) {
		// 주사위를 던져서 6이 나오면 반복문 종료
		
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
		}

	}
}
