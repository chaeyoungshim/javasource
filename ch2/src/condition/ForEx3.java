package condition;

public class ForEx3 {
	public static void main(String[] args) {
		// 1~10 까지 합
		
		int sum = 0;
		int i=1;
		for(;i<11;i++) {
			sum += i;  // sum = sum + i;
		}
		System.out.println(i); // i cannot be resolved to a variable
		System.out.println("1~10 까지 합 : "+sum);
		
		// 1~100까지 합
		sum = 0;
		for(int j=1;j<101;j++) {
			sum += j;
		}
		System.out.println("1~100 까지 합 : "+sum);
	}
}















