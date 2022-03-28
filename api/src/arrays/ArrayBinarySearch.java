package arrays;

import java.util.Arrays;

// BinarySearch : 이진검색(정렬 완료된 상황)

public class ArrayBinarySearch {
	public static void main(String[] args) {
		int arr[] = {11,13,25,27,36,45,65};
		
		//검색
		System.out.println(Arrays.binarySearch(arr, 40));
		System.out.println(Arrays.binarySearch(arr, 36));
	}
}
