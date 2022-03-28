package op;

//삼항 연산자 : 조건?참일 때:거짓일때 수행해야 할 코드
public class ConditionalOperatorEx1 {
	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = score <= 90 ? 'A' : 'B';
		System.out.println(score <= 90 ? 'A' : 'B');
		System.out.println(grade);
		
		// 90 이상이면 A, 80이상이면 B, 나머지 C
		grade=(score >= 90) ? 'A' : ((score >= 80)?'B':'C');
		System.out.println(grade);

	}

}













