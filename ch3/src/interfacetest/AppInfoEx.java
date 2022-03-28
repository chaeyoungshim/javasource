package interfacetest;

public class AppInfoEx {

	public static void main(String[] args) {
//		SeparateVolume obj1 = new SeparateVolume("863ㄱ774", "개미", "베르나르");
		Lendable obj1 = new SeparateVolume("863ㄱ774", "개미", "베르나르");
		obj1.checkOut("홍길동", "2022-02-28");
		
		AppCD obj2 = new AppCD("2022-01", "Oracle");
		obj2.checkOut("성춘향", "2022-03-01");

	}
}
