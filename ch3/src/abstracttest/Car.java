package abstracttest;

//추상클래스 : 템플릿 메소드를 가지고 있음

public abstract class Car {
	
	//추상메소드 : 템플릿 메소드
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
}
