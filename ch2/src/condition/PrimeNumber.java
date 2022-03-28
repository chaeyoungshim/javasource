package condition;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 소수 구하기
		// 1과 자기자신으로만 나누어지는 수
		int count = 0;
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i+" ");
			}
			count = 0;
		}

	}

}







