//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown {
	public static boolean go(int[] numArray) {
		int lastNum = numArray[0];
		int successCount = 0;
		
		if (numArray.length == 1) return true;
		
		for (int i : numArray) {
			if (i < lastNum) successCount++;
		}
		
		if (successCount == numArray.length - 1) return true;
		
		return false;
	}
}