package ap.labs.arraylist16;

import java.util.List;

public class ListTotal {
	public int go(List<Integer> ray) {
		int sum = 0;
		
		for (int i : ray) {
			sum += i;
		}
		
		return sum;
	}
}