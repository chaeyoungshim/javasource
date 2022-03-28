package abstracttest;

public class SportsCar extends Car {

	@Override
	public void drive() {
		System.out.println("스포츠카를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춥니다.");
	}

}
