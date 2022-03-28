package api;


public class ValueOf {
	public static void main(String[] args) {
		
		//지정된 값을 문자열로 반환		
		String b=String.valueOf(false);
		System.out.println(b); // "false"
		
		String c = String.valueOf('c');
		System.out.println(c); // "c"
		
		String f1 = String.valueOf(10f);
		System.out.println(f1); // "10.0"
		
		String l = String.valueOf(10L);
		System.out.println(l); // "10"
		
		
		// "false" => boolean 타입
		boolean b1=Boolean.parseBoolean(b);
		System.out.println(b1);
		
		// "3" => int 타입
		int i=Integer.parseInt("3");
		System.out.println(i);
		
		//  "10.0"  => float 타입
		float f2=Float.parseFloat(f1);
		System.out.println(f2);

	}
}


















