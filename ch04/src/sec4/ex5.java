package sec4;

public class ex5 {

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if ((x * 4 + y * 5) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
