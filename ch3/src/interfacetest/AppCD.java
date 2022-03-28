package interfacetest;

public class AppCD extends CDInfo implements Lendable {
	
	String borrower;
	String checkOutDate;
	int state;
	

	public AppCD(String registerNo, String title) {
		super(registerNo, title);		
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*** "+title+" 이 대출되었습니다. ***");
		System.out.println("대출자 : "+borrower);
		System.out.println("대출일 : "+date);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*** "+title+"CD 가 반납되었습니다. ***");
	}
}











