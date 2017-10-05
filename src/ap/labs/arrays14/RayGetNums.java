package ap.labs.arrays14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetNums {
	public static int[] go(int[] ray)
	{
		int[] found = new int[3];
		int pos = 0;
		
		for (int i : ray){
			if (i > 11 && pos < found.length) {
				found[pos] = i;
				pos++;
			}
		}
		
		return found;
	}
}