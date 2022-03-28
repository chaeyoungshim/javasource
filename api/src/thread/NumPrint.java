package thread;

public class NumPrint implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<16;i++) {
			System.out.print(i+" ");
		}

	}

}
