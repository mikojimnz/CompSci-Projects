package ap.labs.arraylist16;

import java.util.List;

public class ListOddToEven {
	public static Integer go(List<Integer> ray) {
		int oddPos = -1;
		int evenPos = -1;
		
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 != 0) {
				oddPos = i;
				break;
			}
		}
		
		if (oddPos == -1) return -1;

		for (int i = oddPos; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 0) {
				evenPos = i;
			}
		}
		
		if (evenPos == -1) return -1;

		return Math.abs(oddPos - evenPos);
	}
}