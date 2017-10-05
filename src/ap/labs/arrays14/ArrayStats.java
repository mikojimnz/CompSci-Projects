package ap.labs.arrays14;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class ArrayStats {
	// instance variable;
	int length = 0;
	int pos = 0;
	int[] sizes;
	int[] vals;

	// constructor
	public ArrayStats(int[] ray) {
		getGroups(ray);
		System.out.println(toString(ray));
	}

	// set method
	public void getGroups(int[] ray) {

	}

	public int getNumGroupsOfSize(int size) {
		int cnt = 0;

		return cnt;
	}

	public String toString(int[] a) {
		return "" + Arrays.toString(a);
	}
}