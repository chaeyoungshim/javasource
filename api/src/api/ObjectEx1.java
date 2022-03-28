package api;


//Object 메소드
//equals() : 부모는 주소 비교의 형태로 정의가 되어 있음
//String 클래스에서는 오버라이딩을 통해 문자열 비교의 형태로 사용 



public class ObjectEx1 {
	public static void main(String[] args) {
		
		//객체 생성 : default 생성자 호출
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//메소드 호출
		if(obj1.equals(obj2)) { //주소 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		if(obj1 == obj2) { //주소비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// java.lang.Object@7d6f77cc
		System.out.println("obj1.toString() "+obj1.toString());
		// java.lang.Object@5aaa6d82
		System.out.println("obj2.toString() "+obj2.toString());
		
		
		
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		System.out.println(value1.equals(value2)?"같다":"다르다");
		// api.Value@6f75e721
		System.out.println(value1.toString());
		System.out.println(value1);
		

	}
}











