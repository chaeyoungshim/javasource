package abstracttest;

public class Truck extends Car {

	@Override
	public void drive() {
		System.out.println("트럭을 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("트럭을 멈춥니다.");
	}

}
