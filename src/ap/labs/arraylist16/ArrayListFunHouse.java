package ap.labs.arraylist16;

import java.util.List;
import java.util.ArrayList;

public class ArrayListFunHouse {
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = number; i > 0; i--) {
			for (int j = 0; j < number; j++) {
				if (i * j == number) {
					factors.add(j);
				}
			}
		}

		factors.remove(0);

		return factors;
	}

	public static ArrayList<Integer> keepOnlyCompositeNumbers(List<Integer> nums) {
		ArrayList<Integer> composite = new ArrayList<Integer>();

		for (Integer num : nums) {
			int factor = 0;

			for (int i = num; i > 0; i--) {
				for (int j = 0; j < num; j++) {
					if (i * j == num) factor++;
				}
			}

			if (factor > 1) composite.add(num);
		}

		return composite;
	}
}