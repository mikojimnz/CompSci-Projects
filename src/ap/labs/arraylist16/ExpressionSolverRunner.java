package ap.labs.arraylist16;

public class ExpressionSolverRunner {
	public static void main(String args[]) {
		System.out.println(new ExpressionSolver("3 + 5").toString());
		System.out.println(new ExpressionSolver("3 * 5").toString());
		System.out.println(new ExpressionSolver("3 - 5").toString());
		System.out.println(new ExpressionSolver("3 / 5").toString());
		System.out.println(new ExpressionSolver("5 / 5 * 2 + 8 / 2 + 5").toString());
		System.out.println(new ExpressionSolver("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2").toString());
	}
}