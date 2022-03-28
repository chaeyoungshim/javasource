package api;


public class Trim {
	public static void main(String[] args) {
		String s = "     Hello World   ";
		String s1 = "Hello World";
		System.out.println(s.equals(s1));
		System.out.println(s.trim().equals(s1));
		System.out.println(s);
		System.out.println(s.trim()); //양쪽 공백제거

	}
}
