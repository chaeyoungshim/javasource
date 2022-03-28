package array;

public class ArrayEx6 {
	public static void main(String[] args) {
		// 10명의 점수를 배열로 생성하고
		// 최대값, 최소값 출력
		int score[]= {79,88,91,33,100,55,95,45,48,82};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1;i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대값 "+max);
		System.out.println("최소값"+min);

	}
}











