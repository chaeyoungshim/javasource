package classtest;

public class NumbersEx {

	public static void main(String[] args) {
		// Numbers 객체 생성 후 합계, 평균 구하기
//		int arr[]= {15,35,25,99,26,33};
//		Numbers numbers = new Numbers(arr);
		
		
		Numbers numbers = new Numbers(new int[] {15,35,25,99,26,33});
		
		
		System.out.println("합계 : "+numbers.getTotal());
		System.out.println("평균 : "+numbers.getAverage());
		System.out.printf("평균 : %.2f",numbers.getAverage());

	}
}
