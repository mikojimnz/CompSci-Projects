package ap.labs.arrays14;
public class Histogram {
	public static void go(int[] ray) {
		int[] digits = new int[10];
		int[] vals = new int[10];

		for (int i = 0; i < digits.length; i++) {
			digits[i] = i;
		}

		for (int i : ray) {
			vals[i]++;
		}

		for (int i : digits) {
			System.out.println(digits[i] + " - " + vals[i]);
		}

		System.out.println("\n");
	}
}