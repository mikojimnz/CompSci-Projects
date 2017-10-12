package ap.labs.arraylist16;

public class ExpressionSolver {
	private String expression = "";
	private int temp;
	private int in;
	private int result;
	private int operation;

	public ExpressionSolver(String s) {
		expression = s;
		solveExpression();
	}

	public void setExpression(String s) {
		expression = s;
	}

	public void solveExpression() {
		
		for (int i = 0; i <= expression.length() - 1; i++) {
			if (!Character.isWhitespace(expression.charAt(i))) {
				if (Character.isDigit(expression.charAt(i)))  {
					in = expression.charAt(i) - 48;
					System.out.println(i + " | " + expression.charAt(i) + " | " + result + " = " + temp + " " + debug(operation) + " " + in );
					calc();
				}
				if (expression.charAt(i) == '+') operation = 0;
				if (expression.charAt(i) == '-') operation = 1;
				if (expression.charAt(i) == '*') operation = 2;
				if (expression.charAt(i) == '/') operation = 3;
			}
		}

	}

	private String debug(int a) {
		switch (a) {
		case 0: return "+";
		case 1: return "-";
		case 2: return "*";
		case 3: return "/";
		default: return "?";
		}
	}
	
	private void calc() {
		
		switch (operation) {
		default:
			break;
		case 0:
			temp = temp + in;
			break;
		case 1:
			temp = temp - in;
			break;
		case 2:
			temp = temp * in;
			break;
		case 3:
			temp = temp / in;
			break;
		}
		
		result = temp;
		temp = in;
		
	}

	public String toString() {
		return expression + " = " + result + "\n";
	}
}