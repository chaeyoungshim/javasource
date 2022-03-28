package classtest;

public class Car {
	//속성(property, 필드, attribute) : 제조회사(현대),모델(아우디),색상(red),속도(200).......
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//기능 : 전진한다. 후진한다.
	void forward() {
		System.out.println("전진한다");
	}
	void backword() {
		System.out.println("후진한다.");
	}		
	
}
