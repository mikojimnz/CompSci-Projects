package ap.labs.recursion23.lab234;

//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class RecursionFunOne {
	public static int countOddDigits(int num) {
		if (num % 10 > 0) {
			if (num % 2 != 0) {
				return 1 + countOddDigits(num / 10);
			} else {
				return 0 + countOddDigits(num / 10);
			}
		}

		return 0;
	}

	public static int countEvenDigits(int num) {
		if (num > 0) {
			if (num % 2 == 0) {
				return 1 + countEvenDigits(num / 10);
			} else {
				return 0 + countEvenDigits(num / 10);
			}
		}

		return 0;
	}
}