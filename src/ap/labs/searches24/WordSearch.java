package ap.labs.searches24;
//(c) A+ Computer Science

public class WordSearch {
	private String[][] m;
	private boolean debug = true;

	public WordSearch(int size, String str) {
		m = new String[size][size];
		int k = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = String.valueOf(str.charAt(k));
				k++;
			}
		}

		if (debug) {
			for (String[] n : m) {
				for (String o : n) {
					System.out.print(o + " ");
				}
				System.out.println("\n");
			}
		}
	}

	public boolean isFound(String word) {
		checkRight(word, 0, 0);
		checkLeft(word, 0, 0);
		checkUp(word, 0, 0);
		checkDown(word, 0, 0);
		checkDiagUpRight(word, 0, 0);
		checkDiagUpLeft(word, 0, 0);
		checkDiagDownLeft(word, 0, 0);
		checkDiagDownRight(word, 0, 0);

		return false;
	}

	public boolean checkRight(String w, int r, int c) {
		return false;
	}

	public boolean checkLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkUp(String w, int r, int c) {
		return false;
	}

	public boolean checkDown(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		return false;
	}

	public String toString() {
		return "";
	}
}
