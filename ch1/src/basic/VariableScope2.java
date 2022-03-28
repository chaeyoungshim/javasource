package basic;

public class VariableScope2 {
	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1 > 10) {
			int v2 = v1 -10;
			System.out.println("v1 = "+v1+", v2 = "+v2);
		}
		
		//System.out.println("v1 = "+v1+", v2 = "+v2);

	}
}
