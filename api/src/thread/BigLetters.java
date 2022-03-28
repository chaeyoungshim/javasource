package thread;

/* 멀티 쓰레드
 * cpu 사용률 향상
 * 자원 효율적으로 사용
 * 작업이 분리되어 코드가 간결
 * 
 * 카카오톡 : 메세지전송,파일 주고 받기
 */

public class BigLetters {

	public static void main(String[] args) {
		
		//같이 수행할 클래스 지정
		SmallLetters t1 = new SmallLetters();
		t1.start(); // run()을 수행
		
		
		Runnable r = new NumPrint();
		Thread t2 = new Thread(r);
		t2.start();		
		
		//대문자 A~Z 까지 출력
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		

	}

}




