package ap.slides.matrices22;
//(c) A+ Computer Science

// www.apluscompsci.com

//Matrix of references example 1

import static java.lang.System.*;

public class Doggies {
	public static void main(String args[]) {
		Dog[][] herd;
		herd = new Dog[3][3];

		herd[0][0] = new Dog("fred", 11);
		herd[2][2] = new Dog("ann", 21);

		out.println(herd[2][2]);
		out.println(herd[0][0]);
		out.println();

		for (Dog[] row : herd) {
			for (Dog item : row) {
				System.out.print(item + " ");
			}
			out.println();
		}
	}
}