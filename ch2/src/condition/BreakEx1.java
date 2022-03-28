package condition;

public class BreakEx1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break; //while 문 종료
			}
			++i;
			sum += i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);

	}

}










