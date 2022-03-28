package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("hong", "홍길동", "hong123"));
		list.add(new Member("kang", "강길동", "kang123"));
		list.add(new Member("park", "박길동", "park123"));
		list.add(new Member("kim", "김길동", "kim123"));
		
		
		//System.out.println(list);
		
		for(Member member:list) {
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getPassword());
		}
		
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			Member member=list.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getPassword());
		}

	}
}














