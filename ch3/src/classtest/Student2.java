package classtest;

public class Student2 {
	//속성(특성) : 필수는 아님 - 멤버변수(property)
	//기능(동작) : 필수는 아님 - 멤버메소드
	//생성자 : default 생성자, 인자를 받는 생성자
	//         접근제한자(public, private, package) 클래스명(){} 
	//인자(인수-argument) : 괄호안에 들어있는 변수 지칭
	
	//속성 - 학번(20221010), 이름(홍길동), 주소(서울시 중구 ~~), 핸드폰(010-0000-0000)
	int studentId; 
	String studentName;
	String address;
	String mobile;
	
	
	//생성자 : 초기화 담당, 객체를 생성하면서 필요한 사전작업 담당
	//생성자 오버로딩 : 여러개 올 수 있음(단, default 무조건 하나, 인자를 받는 생성자가 여러개로 오는 것)
	//객체를 생성할 때 자동 호출
	public Student2() {
		// default 생성자(무조건 하나만 존재)
		System.out.println("Student2 객체 생성");
	} 
	public Student2(int studentId,String studentName) {
		System.out.println("인자를 받는 Student2 객체 생성(1)");
		// 인자를 받는 생성자
		// this : 객체 자기 자신
		this.studentId = studentId;
		this.studentName = studentName;		
	} 
	public Student2(String studentName,int studentId) {
		System.out.println("인자를 받는 Student2 객체 생성(1)");		
		this.studentId = studentId;
		this.studentName = studentName;		
	} 
	public Student2(int studentId,String studentName,String address) {
		System.out.println("인자를 받는 Student2 객체 생성(2)");	
		this.studentId = studentId;
		this.studentName = studentName;	
		this.address = address;
	} 
	public Student2(int studentId,String studentName,String address,String mobile) {
		System.out.println("인자를 받는 Student2 객체 생성(3)");		
		this.studentId = studentId;
		this.studentName = studentName;		
		this.address = address;
		this.mobile = mobile;
	} 
	
	//기능 - 핸드폰 번호를 변경한다. 주소를 변경한다.
	void changeMobile() {}
	void changeAddress() {}
}

















