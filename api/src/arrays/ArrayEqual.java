package arrays;

import java.util.Arrays;

public class ArrayEqual {
	public static void main(String[] args) {
		int arr1[]= {10,73,2,-5,42};
		int arr2[]= {10,73,2,-5,41};
		
		//arr1요소들과 arr2요소를 비교
		System.out.println(Arrays.equals(arr1, arr2)?"배열요소는 같음":"다름");
		
		System.out.println(Arrays.toString(arr1));
		

	}
}
