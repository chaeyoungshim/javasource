package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		
		System.out.println(list);
		
		//정렬 =>  Arrays.sort() : 배열, Collections.sort() : 컬렉션프레임워크
		Collections.sort(list);
		
		System.out.println(list);
		
		//삭제
		for(int i=list.size()-1;i>=0;i--) {
			if(list.contains(list.get(i))) {
				list.remove(i);				
			}
		}

	}
}










