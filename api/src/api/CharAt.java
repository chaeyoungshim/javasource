package api;


public class CharAt {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		//index => 0부터 시작
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(7));
		
		
		String str2 = "Hello!! Java";
		
		//str2 문자열을 char배열로 생성하고 출력하기
		char[] arr1 = new char[str2.length()];
		
		for(int i=0;i<str2.length();i++) {
			arr1[i] = str2.charAt(i);
		}
		
		System.out.println(arr1);

		
		//문자열에 '프' 문자가 들어있는지 확인하는 프로그램 작성
		//문자가 들어있음, 없음
		boolean flag=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == '프') {
				flag = true;
				break;
			}
		}
		System.out.println(flag?"문자가 들어있음":"없음");
	}
}













