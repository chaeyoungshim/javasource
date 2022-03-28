package condition;

public class DiceSum {
	public static void main(String[] args) {
		// while문과 Math.random() 사용
		// 주사위 2개를 던졌을 때 나오는 값을 (값1, 값2) 형태로 출력
		// 값1 + 값2 의 합이 5가 아니면 계속 주사위를 던지고
		// 합이 5인 경우 실행을 멈추는 프로그램 작성
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			System.out.printf("(%d, %d)\n",dice1,dice2);
			
			if((dice1+dice2) == 5) {
				break;
			}
			
		}
		

	}
}













