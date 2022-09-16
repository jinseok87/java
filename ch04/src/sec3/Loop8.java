package sec3;

public class Loop8 {

	public static void main(String[] args) {
		// 이중 for 문을 활용하여 아래와 같은 형태의 구구단을 출력
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18
		// .........................................
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("수열 - 팩토리얼의 합계 출력");
		
		int sum = 1;
		int sum2 = 0;
		for (int i = 1; i < 11; i++) {
			sum *= i;
			sum2 += sum;
		}
		System.out.println(sum);
	}
}
