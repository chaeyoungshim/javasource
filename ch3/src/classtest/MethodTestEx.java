package classtest;

import java.util.Arrays;

public class MethodTestEx {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		
		MethodTest1 obj  = new MethodTest1();
		
		System.out.println(obj.sum(5, 6));
		
		char charValue =obj.method1(); // 'c' a (97)
		
		int value = charValue+1; // 'c'+1
		System.out.println(value);
		
		float result1 = obj.divide1(5.0f, 2.0f);
		System.out.println(result1);
		
		//array
		int arr[] = {4,5,6,7};
		int arr2[]=obj.array(arr);
		System.out.println(Arrays.toString(arr2));

	}
}















