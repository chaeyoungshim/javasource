package extend;

// CaptionTV : TV + caption

public class TV2 {

	private String color;
	private boolean power;
	private int channel;

	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
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
