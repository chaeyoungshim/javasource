package condition;

public class ForEx7 {
	public static void main(String[] args) {
		// ① int i=1;
		// ② i<4;
		// ③ 안쪽 for 블럭 문 실행
		// ④ int j=1;
		// ⑤ j<4;
		// ⑥ 안쪽 for 블럭 안으로 진입 => * 출력
		// ⑦ j++ (j=2)
		// ⑧ j<4;
		// ⑨  * 출력 **
		// ⑩ j++ (j=3)
		// ⑪ j<4
		// ⑫ * 출력  ***
		// ⑬ j++ (j=4)
		// ⑭ j<4 => 거짓(안쪽 for문 종료)
		// ⑮ System.out.println();
		
		
		// ① i++ (i=2)
		// ② i<4;
		// ③ ~ ⑮ 반복
		
		// ① i++ (i=3)
		// ② i<4;
		// ③ ~ ⑮ 반복
		
		
		// ① i++ (i=4)
		// ② i<4; 거짓(전체 for 종료)
		
		
		
		
		
		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}

















