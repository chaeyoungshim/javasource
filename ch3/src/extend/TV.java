package extend;

// CaptionTV : TV + caption

public class TV {

	String color;
	boolean power;
	int channel;

	
	//기능 : 전원 on/off, 채널 변경
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;   // channel = channel + 1;
	}
	void channelDown() {
		channel--;
	}
}
