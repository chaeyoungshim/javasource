package array;

import java.util.Arrays;

public class ArrayEx7 {
	public static void main(String[] args) {
		// 1~45 번을 가지고 있는 카드 생성
		// 서로 섞은 후 출력
		int card[]=new int[45];
		
		for(int i=0;i<card.length;i++) {
			card[i] = i+1;			
		}
		System.out.println(Arrays.toString(card));
		
//		int a = 10, b = 5;
//		//a,b 교환
//		int z = a;
//		a = b;
//		b = z;
		
		for(int j=0;j<card.length;j++) {
			// 0 ~ 44
			int pos = (int)(Math.random()*45); // 15
			int temp = card[j];
			card[j] = card[pos];
			card[pos] = temp;
		}
		
		System.out.println(Arrays.toString(card));

	}
}















