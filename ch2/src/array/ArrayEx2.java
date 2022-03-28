package array;

public class ArrayEx2 {
	public static void main(String[] args) {
		//방법 1 - 배열 선언, 생성, 초기화
		int arr[]=new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		//방법 2 - 배열 선언, 생성, 초기화
		int arr1[] = new int[] {10,20,30};
		
		//방법 3 - 배열 선언, 생성, 초기화
		int arr2[] = {10,20,30};
		
		//방법 4 
		int arr3[];
		arr3 = new int[] {10,20,30};
		
		
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(arr2[i]);
		}

	}
}











