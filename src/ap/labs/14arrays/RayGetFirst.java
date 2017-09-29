//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetFirst {
	public static int[] go(int[] ray) {
		int look = ray[0];
		int count = 0;
		int pos = 0;
		int[] temp = new int[0];

		if (ray.length == 1) return temp;

		for (int i = 1; i < ray.length; i++) {
			if (ray[i] > look) count++;
		}

		int[] found = new int[count];

		for (int i = 1; i < ray.length; i++) {
			if (ray[i] > look) {
				found[pos] = ray[i];
				pos++;
			}
		}

		return found;
	}
}