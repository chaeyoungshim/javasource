package classtest;

public class Triangle {
	//속성 : 밑변(정수), 높이(정수)
	int baseLine;
	int height;
		
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}

	//기능 : 면적을 구한다.
	//리턴타입 : 실수
	double getArea() {
//		double area = baseLine * height / 2;
//		return area;
		
		return baseLine * height / 2;
	}	
}
