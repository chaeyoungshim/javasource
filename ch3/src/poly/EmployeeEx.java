package poly;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("홍길동");
		employee1.setPosition("사원");
		//employee1.work();
		work(employee1);
		
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("관리자");
		//employee2.work();
		work(employee2);
		
		Adminstrator employee3 = new Adminstrator();
		employee3.setName("정우성");
		employee3.setPosition("사장");
		//employee3.work();
		work(employee3);
	}
	//매개변수의 다형성
	public static void work(Employee employee1) {
		// Employee employee1 = employee1;
		// Employee employee1 = employee2; == Employee employee1 = new Ceo();
		// Employee employee1 = employee3; == Employee employee1 = new Adminstrator();
		employee1.work();
	}
//	
//	public static void work(Ceo employee2) {
//		employee2.work();
//	}
	
//	public static void work(Adminstarator employee2) {
//		employee2.work();
//	}
}












