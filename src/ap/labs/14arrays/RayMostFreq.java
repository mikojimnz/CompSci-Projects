//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayMostFreq {
	public static int go(int[] ray) {
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