public class Ex07 {

	public static void main(String[] args) {
		int max = 0;
		int min = 9;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}

			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
