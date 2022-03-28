package thread;

public class SmallLetters extends Thread {

	@Override
	public void run() {
		//스레드로 실행할 코드 작성
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch+" ");
		}

	}

}
