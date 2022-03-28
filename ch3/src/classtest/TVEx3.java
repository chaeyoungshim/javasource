package classtest;

import java.util.Arrays;

public class TVEx3 {
	public static void main(String[] args) {
		// TV 객체를 배열로 생성

		// 타입 배열명[] = new 타입[5];
		// int arr[] =  new int[5];
		
		TV tvArr[] = new TV[5];
		// tvArr[0], tvArr[1]....
		System.out.println(Arrays.toString(tvArr));
		//System.out.println(tvArr[0].channel); //NullPointerException
		
		//TV객체 생성 후 배열에 담기
//		tvArr[0] = new TV();
//		tvArr[0].channel = 10;		
//		
//		tvArr[1] = new TV();
//		tvArr[1].channel = 11;
//		
//		tvArr[2] = new TV();
//		tvArr[2].channel = 12;
//		
//		tvArr[3] = new TV();
//		tvArr[3].channel = 13;
//		
//		tvArr[4] = new TV();
//		tvArr[4].channel = 14;
		
		int length = tvArr.length; //5
		for(int i=0;i<length;i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;		
		}
		
	}
}














