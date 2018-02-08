package ap.labs.recursion23.lab234;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner {
	public static void main(String args[]) {
		// Lab 2
		out.println("\nLab 2\n Odds");
		out.println(RecursionFunOne.countOddDigits(4532));
		out.println(RecursionFunOne.countOddDigits(11145322));
		out.println(RecursionFunOne.countOddDigits(224532714));
		out.println(RecursionFunOne.countOddDigits(2468));
		out.println(RecursionFunOne.countOddDigits(13579));
		out.println("\n Evens");
		out.println(RecursionFunOne.countEvenDigits(4532));
		out.println(RecursionFunOne.countEvenDigits(11145322));
		out.println(RecursionFunOne.countEvenDigits(224532714));
		out.println(RecursionFunOne.countEvenDigits(2468));
		out.println(RecursionFunOne.countEvenDigits(13579));

		// Lab 3
		out.println("\nLab 3\n");
		out.println(RecursionFunTwo.countChickens("itatfun"));
		out.println(RecursionFunTwo.countChickens("itatchickenfun"));
		out.println(RecursionFunTwo.countChickens("chchickchickenenicken"));
		out.println(RecursionFunTwo.countChickens("chickchickfun"));
		out.println(RecursionFunTwo.countChickens("chickenbouncetheballchicken"));

		// Lab 4
		out.print("\nLab 4\n");
		out.println(RecursionFunThree.luckyThrees(3));
		out.println(RecursionFunThree.luckyThrees(31332));
		out.println(RecursionFunThree.luckyThrees(134523));
		out.println(RecursionFunThree.luckyThrees(3113));
		out.println(RecursionFunThree.luckyThrees(13331));
		out.println(RecursionFunThree.luckyThrees(777337777));
	}
}