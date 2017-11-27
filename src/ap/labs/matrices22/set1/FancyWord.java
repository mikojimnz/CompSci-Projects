package ap.labs.matrices22.set1;
//(c) A+ Computer Science

import java.util.Arrays;

public class FancyWord {
	private String[][] mat;

	public FancyWord(String s) {
		mat = new String[s.length()][s.length()];

		for (String[] i : mat) {
			Arrays.fill(i, " ");
		}

		for (int i = 0; i < s.length(); i++) {
			mat[i][i] = s.substring(i, i + 1);
			mat[s.length() - 1 - i][i] = s.substring(i, i + 1);
			mat[0][i] = s.substring(i, i + 1);
			mat[mat.length - 1][i] = s.substring(i, i + 1);
		}
	}

	public String toString() {
		String output = "";

		for (String[] i : mat) {
			for (String j : i) {
				output += j;
			}

			output += "\n";
		}

		return output + "\n\n";
	}
}