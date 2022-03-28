package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {

	public static void main(String[] args) {
		// Scanner를 사용하여 5개의 실수 값을 사용자로부터 받아서 ArrayList에 저장한 후 검색하여 
		// 가장 큰 수 출력
		// 예시)
		// 입력값 : 3.14 2.1 -5.5 99.9 33.7  => "3.14 2.1 -5.5 99.9 33.7"
		// 출력값 : 가장 큰 수는 99.9
		
		
		Scanner sc = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();		
		//list.add(3.14);
		System.out.println("실수 입력");
		String input=sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input); //공백을 기준으로 분리
		while(token.hasMoreTokens()) {
			list.add(Double.parseDouble(token.nextToken()));
		}
		
		System.out.println(list);
		
		double max = 0;
		for(Double value : list) {
			if(max < value) {
				max = value;
			}
		}		
		System.out.println("가장 큰 수는 "+max);
		
		// Collections.sort(),  Collections.max()
		System.out.println("가장 큰 수는 "+Collections.max(list));
		

	}
}

















