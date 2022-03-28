package classtest;

//import : 다른 패키지에 있는 클래스를 사용할 때 필요
//       : 자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능


// static final : 상수
// 상수 : 대문자로 표현
public class Earth {
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
