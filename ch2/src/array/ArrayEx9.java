package array;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 2차원 배열
		int scores[][] = new int[3][3];
		
		//1행
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		
		//2행
		scores[1][0] = 40;
		scores[1][1] = 50;
		scores[1][2] = 60;
		
		//3행
		scores[2][0] = 70;
		scores[2][1] = 80;
		scores[2][2] = 90;
		
		//행 길이
		for(int i=0;i<scores.length;i++) {
			//열 길이
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int score[]:scores) {
			for(int j:score) {
				System.out.print(j+" ");				
			}
			System.out.println();
		}
		
		
		
	}

}














