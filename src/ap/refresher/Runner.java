import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.println("Enter a number");

		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();

		System.out.println("Enter another number");
		int num2 = kb.nextInt();
		kb.close();

		int equals = addThem(num1, num2);
		System.out.println("The sum is " + equals);
		equals = subtractThem(num1, num2);
		System.out.println("The difference is " + equals);
		System.out.println(theBiggest(num1, num2));
	}

	public static int addThem(int a, int b) {
		int ans = a + b;
		return ans;
	}

	public static int subtractThem(int a, int b) {
		int ans = a - b;
		return ans;
	}

	public static String theBiggest(int z, int zz) {
		if (z > zz) {
			return "your first number is bigger";
		} else if (z < zz) {
			return "your second number is bigger";
		} else {
			return "they are the same";
		}

	}
}
