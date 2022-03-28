package exam;

public class IPTV extends ColorTV {
	
	private String address; //주소

	public IPTV(int size, int color, String address) {
		super(size, color);
		this.address = address;
	}
	
	void printProperty() {
		System.out.println("나의 IPTV는 "+address+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
	
	
	
}
