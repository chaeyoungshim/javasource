package api;


public class Replace {
	public static void main(String[] args) {
		// String : immutable(불변) 객체
		
		String str1 = "Hello Java. Hello Java";
		System.out.println(str1.replace("Java", "자바"));
		
		String str3 = str1.replace("Java", "자바");
		System.out.println(str3);
		
		String str4 = str1.replaceFirst("Java", "자바");
		System.out.println(str4);
		
		
		
		String str2 = "Hello";
		str2+=" 안녕하세요";
		str2+=" 반갑습니다";
		str2+=" 감사합니다";
		str2+=" 안녕히가세요";
		System.out.println(str2);
	}
}















