package sec1;

public class Oper5 {

	public static void main(String[] args) {
		//비트(2진) 연산
		
//		보수  
//		2진수, 8진수 , 16진수 계산방법
		int a=10, b=20, c=30, d=40 , e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d = " + e); //2진수 and  -> 8
		System.out.println("c | d = " + f); //2진수 or  -> 62
		System.out.println("c | d = " + g); //2진수 보수  -> -9
		System.out.println("c ^ d = " + h); // 배타적 OR(eXclusive OR)  -> 54
		System.out.println("d >> 2 => " + (d >> 2));  //오른쪽 시프트(shift) -> 10
		System.out.println("d << 2 => " + (d << 2));  //왼쪽 시프트(shift) -> 160
		System.out.println("d >>> 2 => " + (d >>> 2));////왼쪽이중 시프트(shift)-> 10
		System.out.println("d <<< 2 는 존재하지 않음");
		//연산시 부정과 불능 그리고 예외처리
//		System.out.println(a/0);  //Not a Number => NaN (부정)
//		System.out.println("k" / 4);
		System.out.println('k' / 4);
//		System.out.println(a%0); // Infinity (불능)
		try {
			int k =20;
		System.out.println(a%0); //			//실행해야할 구문
		} catch(ArithmeticException i){ //실행해야할 구문이 오류 발생시 처리해야할 내용 
			System.out.println("산술연산에 오류가 존재함");
		}
		int value =356;
		System.out.println(value -56);
		
		double x =5.0;
		double y =0.0;
		double z =x % y;
		
		if (Double.isNaN(z)){
			System.out.println("0으로 나눌 수 없다 ");
		}else{
			double result = z + 10;
			System.out.println("결과 : "+ result);
		}
		
		
	}

}
