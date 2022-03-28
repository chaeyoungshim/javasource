package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort3 {

	public static void main(String[] args) {
		String arr[]= {"good","height","very","apple","zero","zoo"};

		//오름차순 정렬
		//Arrays.sort(arr);
		
		//내림차순 정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
	}

}
