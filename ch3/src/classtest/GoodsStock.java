package classtest;

import java.net.Socket;

public class GoodsStock {
	//속성 - 상품코드(P1010), 재고수량(25)
	String code;
	int stockNum;
	
	//생성자
	public GoodsStock() {
		// default 생성자
		super();
	}
	public GoodsStock(String code) {
		super();
		this.code = code;
	}
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}	
	
	
	//기능 - 재고추가, 재고감소
	//메소드(== 함수) : 어떤 기능을 가지고 있음
	//리턴타입 메소드명(인자....){
	//   해야할 일 명시
	//}
	
	//리턴타입 : 데이터타입(byte,short,int,long,char,float,double,boolean) 모두 가능
	//         : 배열타입(byte[], short[], int[]....)
	//         : 클래스,인터페이스
	//         : void - 가지고 갈 거 없음
	//         : 메소드가 일을 끝내고 돌아갈때 가지고 가야할 데이터 타입
	// int method1(){} : method1 일을 끝내고 int 타입을 가지고 돌아갈거야
	








	// 재고추가 : 재고수량을 입력받아서 현재 재고수량에 추가하기 / 현재 재고수량이 얼마인지 보내기
	int addStock(int amount) {
		stockNum += amount; // stockNum = stockNum + amount
		return stockNum; //메소드를 호출한 곳으로 값 보내기
	}	
	
	

	// 재고감소 : 판매수량을 입력받아서 현재 재고수량에서 감소하기 / 현재 재고수량 리턴
	int subtractStock(int amount) {
		stockNum -= amount;
		return stockNum;
	}
}













