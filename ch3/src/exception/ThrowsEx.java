package exception;

public class ThrowsEx {

	public static void main(String[] args) /*throws ClassNotFoundException*/ {
		
		Exception e1;
		
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}

	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}

}
