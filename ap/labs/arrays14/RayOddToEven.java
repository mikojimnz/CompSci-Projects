//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static Integer go(int[] ray) {
		int oddPos = -1;
		int evenPos = -1;
		
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 != 0) {
				oddPos = i;
				break;
			}
		}
		
		if (oddPos == -1) return -1;
		
		for (int i = oddPos; i < ray.length; i++) {
			if (ray[i] % 2 == 0) {
				evenPos = i;
				break;
			}
		}
		
		if (evenPos == -1) return -1;
		
		return evenPos - oddPos;
	}
}