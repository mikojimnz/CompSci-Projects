package ap.labs.matrices22.set1;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class PascalsTriangle {
	private int[][] mat;

	public PascalsTriangle() {

	}

	public PascalsTriangle(int size) {
		mat = new int[size][];
		for (int i = 0; i < mat.length; i++) {
			mat[i] = new int[i + 1];
		}
		
		createTriangle();
	}

	public void createTriangle() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = mat[i][j] + mat[i][j]; //TODO
			}
		}
	}

	public String toString() {
		String output = "";

		for (int[] i : mat) {
			for (int j : i) {
				if (i.length % 2 == 0) {
					output += j + "  ";
				} else {
					output += j + "  ";
				}
			}

			output += "\n";
		}

		return output;
	}
}