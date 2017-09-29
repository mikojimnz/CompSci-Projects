package ap.slides.arrays14;

//(c) A+ Computer Science
// www.apluscompsci.com

//array loop access example 1

import static java.lang.System.out;

public class ArrayLoopOne {
	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		// add in a traditional for loop to print out nums
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "  ");

		}

		out.println("\n\n");

		// another bug to fix - what is the problem?
		int[] intList = new int[50];

		for (int i = 0; i < intList.length; i++) {
			int r = (int) (Math.random() * 5000);
			intList[i] = r;
		}

		// add in a for each loop print out intList - use the for each loop
		for (int i : intList) {
			System.out.print(i + " ");
		}

		int sum = 0;

		for (int i : intList) {
			sum += i;
		}

		System.out.println("\n\n My total is " + sum);

	}
}