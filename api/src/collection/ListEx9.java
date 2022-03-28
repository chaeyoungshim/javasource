package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx9 {
	public static void main(String[] args) {
		// 한 어린이의 키를 2015~2021년 사이에 1년 단위로 입력받아
		// ArrayList에 저장, 가장 키가 많이 자란 연도 출력하기
		// 예시)
		// 입력값 : 120 122 125 130 139 145 149
		// 출력값 : 가장 키가 많이 자란 년도는 2019년 9cm 
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("2015~2021년 사이까지 1년 단위로 키(cm)를 입력하세요");
		String input = sc.nextLine(); // 120 122 125 130 139 145 149
		
		StringTokenizer token = new StringTokenizer(input);
		while(token.hasMoreTokens()) {
			list.add(Integer.parseInt(token.nextToken()));
		}
		
		
		int between=0,pos=0;
		for(int i=0;i<list.size()-1;i++) {
			int diff = list.get(i+1) - list.get(i); // 122-120
			if(between < diff) {
				between = diff;
				pos = i;
			}			
		}
		System.out.println("가장 키가 많이 자란 연도는 "+(pos+2015)+" 년 "+between+"cm");

	}
}
















