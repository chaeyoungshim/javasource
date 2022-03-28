package interfacetest;

public class RemoteEx {
	public static void main(String[] args) {
		
		//String msg;
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		
		// Cannot instantiate the type RemoteControl
		// RemoteControl rc1 = new RemoteControl();
		
		
		//익명 구현 객체
		RemoteControl rc1 = new RemoteControl() {
			
			@Override
			public void turnOn() {				
				System.out.println("Radio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Radio를 끕니다.");			
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 "+volume);				
			}
		};
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.turnOff();
	}
}















