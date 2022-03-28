package extend;

public class CaptionTV extends TV{
//	String color;
//	boolean power;
//	int channel;
	
	//캡션 기능
	boolean caption;
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
//	//기능 : 전원 on/off, 채널 변경
//	void power() {
//		power = !power;
//	}
//	void channelUp() {
//		channel++;   // channel = channel + 1;
//	}
//	void channelDown() {
//		channel--;
//	}
}
