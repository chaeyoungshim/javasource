package condition;
/* 반복문
 * 어떤 작업이 반복적으로 실행되도록 할 때 사용
 * for / while / do ~ while 
 */
public class ForEx1 {
	public static void main(String[] args) {
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		
		//반복문 사용시
		for(int i=0;i<10;i++) {
			//①  int i=0; 처음 한 번만 실행 
			//②   i<10; true 가 결과값으로 나오는 경우만 for 실행
			//③  for 블럭 안으로 진입 => {} 안 구문 실행
       		//④  i++(i=i+1) i = 1
			//⑤  i<10; ( 1 < 10 )
			//⑥  for 블럭 안으로 진입 => {} 안 구문 실행
			//⑦  i++(i=i+1) i = 2
			//⑧  i<10; ( 2 < 10 )
			//⑨  for 블럭 안으로 진입 => {} 안 구문 실행
			// ......
			//    i++ (i = 10)
			//    i < 10 ( 10 < 10 ) false 가 되는 순간 반복문 종료
			
			System.out.println("안녕하세요");
		}

	}
}















