package ap.labs.matrices22.set1;

import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner {
	public static void main(String args[]) throws Exception {
		
		Scanner f = new Scanner(new File("matsum.dat"));
		int times = f.nextInt();
		MatrixSumming ms = new MatrixSumming();
		
		for (int dx = 0; dx < times; dx++) {
			int r = f.nextInt();
			int c = f.nextInt();
			out.println("The sum of " + r + "," + c + " is " + ms.sum(r + 1, c + 1));
		}

		f.close();
	}
}
