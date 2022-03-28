package array;

public class ArrayEx3 {
	public static void main(String[] args) {
		//score 배열명으로 5개의 int 값을 담는 배열 생성
		//0,10,20,30,40
		//int score[] = {0,10,20,30,40};
		
		int score[] = new int[5];
		
		for(int i=0;i<score.length;i++) {
			score[i] = i * 10;			
		}
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
		int score2[] = {48,78,25,65,36,79};
		// score2 평균,합계
		// int sum = score2[0] + score2[1] + ......
		int sum = 0;
		for(int i=0;i<score2.length;i++) {
			sum += score2[i];
		}
		System.out.println("score2 합계 : "+sum);
		System.out.println("score2 평균 : "+sum/score2.length);
		

	}
}
























