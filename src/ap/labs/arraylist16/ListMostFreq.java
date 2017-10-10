package ap.labs.arraylist16;

import java.util.*;

public class ListMostFreq {

	public static int go(List<Integer> ray) {
		int largest = 0;
		int total = 0;

		for (int i : ray) {
			int curent = 0;
			
			for (int j : ray) {
				if (j == i) {
					curent++;
				}
			}
			
			if (curent > total) {
				largest = i;
				total = curent;
			}
		}

		return largest;
	}
}