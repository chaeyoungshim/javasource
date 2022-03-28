package poly;

public class BuyerEx {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		System.out.println("현재 잔액 "+b.money);
		System.out.println("현재 보너스 포인트 "+b.bonusPoint);
	}

}
