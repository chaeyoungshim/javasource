package array;

// 향상된 for : 배열, 리스트 사용
// for(타입 변수명 : 배열명(or 리스트명)){
//    수행문;
// }



public class ArrayEx4 {
	public static void main(String[] args) {
		char chArr[]= {'a','b','c','d','e'};
		
		for(int i=0;i<chArr.length;i++) {
			System.out.println(chArr[i]);
		}
		
		for(char ch:chArr) { //chArr 배열에서 차례로 하나씩 가져와서 ch라는 변수에 담아라
			System.out.println(ch);
		}
		
		
		//예외-char 배열인 경우에는 문자 자체가 출력됨
		System.out.println(chArr);
		
		
		
		String str[]= {"a","b","c","d","e"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		for(String s:str) {
			System.out.println(s);
		}
		
		System.out.println(str);
	}
}















