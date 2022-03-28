package exam;
import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src); //추상메소드
	abstract protected String getSrcString(); //추상메소드 "원"
	abstract protected String getDestString(); //추상메소드 "달러"
	protected double ratio; //비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+" 을 "+getDestString()+" 로 바꿉니다.");
		System.out.println(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble(); //실수 입력받기
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
		scanner.close();
	}
	
	
	
}
