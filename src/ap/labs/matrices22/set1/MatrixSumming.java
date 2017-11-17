package ap.labs.matrices22.set1;
//(c) A+ Computer Science

public class MatrixSumming {
	private int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 6, 7, 1, 2, 5 }, { 6, 7, 8, 9, 0 },
			{ 5, 4, 3, 2, 1 } }; // load in the matrix values

	public int sum(int r, int c) {
		int sum = 0;

		for (int rr = r - 1; rr <= r + 1; rr++) {
			for (int cc = c - 1; cc <= c + 1; cc++) {
				if (rr >= 0 && rr < m.length && cc >= 0 && cc < m[0].length) {
					sum += m[rr][cc];
				}
			}
		}

		return sum;
	}

	@Override
	public String toString() {
		String matrix = "";

		for (int[] i : m) {
			for (int j : i) {
				matrix += j + "  ";
			}

			matrix += "\n";
		}
		return matrix;
	}
}
