package exception;

public class ArithmethicExceptionEx {

	public static void main(String[] args) {
		
		int num1=5, num2=0;
		//java.lang.ArithmeticException
		
		try { //예외가 발생할 만한 코드
			System.out.println(num1/num2);
			
		} catch (Exception e) {//예외가 발생하면 처리
			//System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}	

	}

}
