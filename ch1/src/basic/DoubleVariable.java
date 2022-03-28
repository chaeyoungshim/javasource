package basic;

//실수 => 3.14
//     => 부동 소수점 방식 ( 가수부분 / 지수부분 )


//실수형 : 1. float(4byte) : 부호비트 1비트, 지수부 8비트, 가수부 23비트(F, f 필요)
//         2. double(8byte)-기본타입 : 부호비트 1비트, 지수부 11비트, 가수부 52비트(D, d)
//                                   : double 타입이 실수를 더 정밀하게 표현

public class DoubleVariable {
	public static void main(String[] args) {
		double d1 = 90.17;  
		double d2 = 100.123d;
		System.out.println("d1 = "+d1+", d2 = "+d2);
	}

}
