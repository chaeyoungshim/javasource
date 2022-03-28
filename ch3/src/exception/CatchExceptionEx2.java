package exception;
//   catch (Exception e) {} : 모든 Exception 처리 가능
public class CatchExceptionEx2 {
	public static void main(String[] args) {
		
		
		try {
			
			// ArrayIndexOutOfBoundsException
			String data1=args[0]; 
			String data2=args[1]; 
			
			// NumberFormatException
			int value1 = Integer.parseInt(data1); // "a100" 
			int value2 = Integer.parseInt(data2);		
			
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변경할 수 없습니다.");
		} 

	}
}










