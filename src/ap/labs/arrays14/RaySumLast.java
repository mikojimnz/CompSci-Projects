package ap.labs.arrays14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast {
	public int go(int[] ray) {
		int lastNum = ray[ray.length - 1];
		int sum = 0;

		for (int i : ray) {
			if (i > lastNum) sum += i;
		}

		return sum == 0 ? -1 : sum;
	}
}