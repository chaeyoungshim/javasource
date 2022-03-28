package shop;

public class SmartTV extends Product {

	private String resolution;  //해상도
	
	public SmartTV(String name, int price,String resolution) {
		super(name, price);
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : "+resolution);
	}

}
