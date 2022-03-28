package classtest;

public class PhysicalInfo {
	//속성 - 이름, 나이, 키, 몸무게
	String name;
	int age;
	double height;
	double weight;
	
	//생성자 - 멤버변수 4개를 모두 전달인자로 받는 형태
	public PhysicalInfo(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드 - update
	// age 를 받아서 현재 age 를 변경
	void update(int age) {
		this.age = age;
	}
	// age, height 받아서 현재, age, height 변경
	void update(int age,double height) {
		this.age = age;
		this.height = height;
	}
	// age, height, weight 받아서 현재 age, height,weight 변경
	void update(int age,double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}















