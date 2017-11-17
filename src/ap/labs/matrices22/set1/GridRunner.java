package ap.labs.matrices22.set1;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.IOException;
import static java.lang.System.*;

public class GridRunner {
	
	private static int rows = 9;
	
	private static int columns = 9;
	
	private static String[] sample = {"a", "b", "c"};
	
	private static String[] search = {"a", "b", "c"};
	
	public static void main(String args[]) throws IOException {
		Grid g = new Grid(rows, columns, sample);
		System.out.println( g );
		System.out.println( g.findMax(search) );
	}
}