package ap.labs.matrices22.set1;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("src/ap/labs/matrices22/set1/triangle.dat").getAbsoluteFile());
		int size = file.nextInt();
		file.nextLine();

		for (int i = 0; i < size; i++) {
			int word = file.nextInt();
			out.println(new PascalsTriangle(word));
		}

		file.close();
	}
}
