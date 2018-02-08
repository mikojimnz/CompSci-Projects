package ap.labs.recursion23.lab234;

//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class RecursionFunTwo {
	public static int countChickens(String word) {
		if (word.indexOf("chicken") == -1) {
			return 0;
		} else {
			return countChickens(word.replaceFirst("chicken", "")) + 1;
		}
	}
}