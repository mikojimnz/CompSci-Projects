//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst {
	public boolean go(int[] ray) {
		if (ray.length <= 0 ) return false;
		 
		int firstNum = ray[0];
		boolean found = false;
		
		for (int i = 1; i < ray.length; i++) {
			if (ray[i] == firstNum) found = true;
		}
		
		return found;
	}
}