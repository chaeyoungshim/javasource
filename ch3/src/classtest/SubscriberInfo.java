package classtest;

//가입자정보
public class SubscriberInfo {
	//속성 : 이름,아이디(문자,숫자 8자리),패스워드(문자,숫자,특수문자 15자리),전화번호(010-1234-1234),주소
	String name;
	String id; //hong1234
	String password; //hong1234!@~
	String phone;
	String address;
	
	
	public SubscriberInfo() {
		super();		
	}	
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	//기능 : 비밀번호 변경, 전화번호 변경, 주소 변경
	//비밀번호 변경 : 새로운 비밀번호를 입력받아 기존 비밀번호 변경
	void changePassword(String newPassword) {
		this.password = newPassword;
	}
	//전화번호 변경 : 새로운 전화번호를 입력받아 기존 전화번호 변경
	void changePhone(String newPhone) {
		this.phone = newPhone;
	}
	//주소 변경 : 새로운 주소를 입력받아 기존 주소 변경
	void changeAddress(String newAddress) {
		this.address = newAddress;
	}
}
















