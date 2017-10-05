package ap.labs.arraylist16;

import java.util.List;

public class ListSumFirst {
	public int go(List<Integer> ray) {
		int search = ray.get(0);
		int sum = 0;
		
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) > search) sum += ray.get(i);
		}
		
		return sum == 0 ? -1 : sum;
	}
}