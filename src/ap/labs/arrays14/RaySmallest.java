package ap.labs.arrays14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest {
	public static int go(int[] ray) {
		int smallest = ray[0];
		
		for (int i : ray) {
			if (i < smallest) smallest = i;
		}
		
		for (int i = ray.length; i < 0; i--) {
			if (i < smallest) smallest = i;
		}
		
		return smallest;
	}
}