package ap.labs.arrays14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal {
	public int go(int[] ray) {
		int sum = 0;

		for (int i : ray) {
			sum += i;
		}

		return sum;
	}
}