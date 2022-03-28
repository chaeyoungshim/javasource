package poly;

public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}
