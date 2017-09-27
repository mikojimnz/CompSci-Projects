import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String str = "Bishop Moore High School";

		System.out.println("The first character is " + getFirst(str));
		System.out.println("The last character is " + getLast(str));
		System.out.println(getRange(str));
		printDown(str);
		printBackwards(str);
		printSkip(str);
		System.out.println(reverseWord(str));
	}

	public static char getFirst(String s) {
		return s.charAt(0);
	}

	public static char getLast(String s) {
		return s.charAt(s.length() - 1);
	}

	public static String getRange(String s) {
		System.out.println("\n----\n");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = kb.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = kb.nextInt();
		kb.close();

		return s.substring(n1 - 1, n2);
	}

	public static boolean isItThere(String s, char letter) {
		return (s.indexOf(letter) >= 0) ? true : false;
	}

	public static void printDown(String s) {
		System.out.println("\n----\n");

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printBackwards(String s) {
		System.out.println("\n----\n");

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printSkip(String s) {
		System.out.println("\n-----\n");

		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i) + " ");
		}
	}
	
	public static String reverseWord(String s) {
		System.out.println("\n-----\n");
		
		String reverse = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
}
