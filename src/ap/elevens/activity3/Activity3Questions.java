package ap.elevens.activity3;

import java.util.Arrays;

/**
 * @author Miko Jimenez
 *
 */
public class Activity3Questions {

	/**
	 * Runner
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(flip());
		System.out.println(arePermutations(new int[] { 0, 1, 2, 3, 4 }, new int[] { 3, 2, 1, 0 }));

	}

	/**
	 * Question 1
	 * 
	 * @return Tails if coin is even and Heads if odd;
	 */
	public static String flip() {
		int coin = 0 + (int) (Math.random() * 3);
		;
		System.out.println(coin);
		if (coin % 2 == 0) {
			return "Tails";
		} else {
			return "Heads";
		}

	}

	/**
	 * Question 2
	 * 
	 * @param a int array 1
	 * @param b int array 2
	 * @return true if b is a permutation of a
	 */
	public static boolean arePermutations(int[] a, int[] b) {
		int[] rayA = a;
		int[] rayB = b;

		Arrays.sort(rayA);
		Arrays.sort(rayB);

		if (rayA.equals(rayB)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Question 3 The random integers generated would have to be 3, 2, 1, 0 to pull
	 * the last card every time and reverse the array;
	 */
}
