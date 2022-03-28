package condition;

// continue; 반복문과 함께 사용
//           continue 문 이후의 문장 수행하지 않음

public class ContinueEx1 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}
}
