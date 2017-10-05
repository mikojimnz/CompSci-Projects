package ap.labs.arraylist16;

import java.util.List;

public class ListAverage {
	public double go(List<Integer> ray) {
		int smallest = ray.get(0);
		int largest = ray.get(0);
		
		for (Integer i : ray) {
			if (i < smallest) smallest = i;
			if (i > largest) largest = i;
		}
		
		return (smallest + largest) / 2;
	}
}