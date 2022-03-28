package condition;

public class ForEx9 {
	public static void main(String[] args) {
		// 구구단 2 ~ 9
		
		// 2 * 1 = 2   2 * 2 = 4
		// 3 * 1 = 3

		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\t", i,j,(i*j));
			}
			System.out.println();
		}
		
		
		
	}

}
