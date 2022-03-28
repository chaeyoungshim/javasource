package extend;

public class DMBCellPhone extends CellPhone {
	int channel;
	
	void turnOn() {
		System.out.println("채널 "+channel +" 번 방송 시작");
	}
	void turnOff() {
		System.out.println("채널 "+channel +" 번 방송 종료");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+this.channel +" 번으로 변경");
	}
}
