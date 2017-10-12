package ap.labs.arraylist16;

public class ExpressionSolver {
	private String expression = "";
	private int op;
	private int in;
	private int ram;
	private int result;
	private boolean first = true;

	public ExpressionSolver(String s) {
		expression = s;
		solveExpression();
	}

	public void setExpression(String s) {
		expression = s;
	}

	public void solveExpression() {
		
		for (int i = 0; i <= expression.length() - 1; i++) {
			if (Character.isDigit(expression.charAt(i))) in = expression.charAt(i) - 48;
			if (expression.charAt(i) == '+') op = 0;
			if (expression.charAt(i) == '-') op = 1;
			if (expression.charAt(i) == '*') op = 2;
			if (expression.charAt(i) == '/') op = 3;
			
			if (first) {
				ram = in;
				first = false;
			}
			
			calc();
		}
	
		result = ram;

	}
	
	public void calc() {
		switch (op) {
		case 0:
			ram += in;
		case 1:
			ram -= in;
		case 2:
			ram *= in;
		case 3:
			ram /= in;
		}
	}

	public String toString() {
		return expression + " = " + result + "\n";
	}
}