//(c) A+ Computer Science
// www.apluscompsci.com

//Array instance variable example two

import static java.lang.System.*;

import java.util.Scanner;

public class ArrayIVarsTwo {
	private int[] nums;

	public ArrayIVarsTwo(String lt) {
		// instantiate the array so that it can store 10 integers
		nums = new int[10];

		// put the ten numbers from list into nums
		setNums(lt);
	}

	public void setNums(String list) {
		// complete method setNums
		Scanner chopper = new Scanner(list);
		int i = 0;

		while (chopper.hasNextInt()) {
			int num = chopper.nextInt();
			nums[i] = num;
			i++;
		}

		chopper.close();
	}

	public String toString() {
		String out = "";

		for (int i : nums) {
			out += i + " ";
		}

		return out;
	}

	public static void main(String args[]) {
		ArrayIVarsTwo test = new ArrayIVarsTwo("1 2 3 4 5 6 7 8 9 10");
		out.println(test);

		test.setNums("3 4 5 6 7 8 9 1 2 0");
		out.println(test);
	}
}
