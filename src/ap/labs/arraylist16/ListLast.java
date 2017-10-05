package ap.labs.arraylist16;

import java.util.List;

public class ListLast {
	public static boolean go(List<Integer> ray) {
		int search = ray.get(ray.size() - 1);
		int count = 0;
		
		for (Integer i : ray) {
			if (i == search) count++;
		}
		
		return count > 1 ? true : false;
	}
}