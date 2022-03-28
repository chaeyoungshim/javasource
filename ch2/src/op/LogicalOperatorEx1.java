package op;


// 논리 연산자 : 결과가 true, false 
// && : 논리 곱 and
// || : 논리 합 or
// ! : 부정
public class LogicalOperatorEx1 {
	public static void main(String[] args) {
		
		boolean result = (5 > 3) && (5 > 2);
		System.out.println(result);
		
		result = (5 > 3) || (5 < 2);
		System.out.println(result);

	}
}
