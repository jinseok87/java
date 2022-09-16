package sec2;

public class Cast1 {

	public static void main(String[] args) {
		int a=1004, b; //4byte
		short c, d; //2byte
		long e, f; 
		byte g, h; //1byte
		b = 65538;
//		c = a;   
		c = 500;  // short -> int = 자동 형 변환 (auto casting)
		a = c;		// 형 변환 연산자에 의한 형 변환 (force casting)
		d = (short) b;
		System.out.println("d="+d);
		System.out.println("b="+b);
		
	}

}
