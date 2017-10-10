package ap.labs.arraylist16;

import java.util.List;
import java.util.ArrayList;

public class ListGetNums {
	public static List<Integer> go(List<Integer> ray) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (Integer i : ray) {
			if (i > 11 && nums.size() < 3) {
				nums.add(i);
			}
		}
		
		if (nums.isEmpty()) {
			nums.add(0);
			nums.remove(0);
		}

		return nums;
	}
}