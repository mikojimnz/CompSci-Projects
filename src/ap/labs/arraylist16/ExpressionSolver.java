package ap.labs.arraylist16;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver {
	private String expression = "";
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	private ArrayList<String> ops = new ArrayList<String>();
	private int result;

	public ExpressionSolver(String s) {
		expression = s;
		solveExpression();
	}

	public void setExpression(String s) {
		expression = s;
	}

	public void solveExpression() {

		for (int i = 0; i < expression.length(); i++) {
			if (!Character.isWhitespace(expression.charAt(i)))
				continue;

			if (Character.isDigit(expression.charAt(i))) {
				nums.add(expression.charAt(i) - 48);
			} else {
				switch (expression.charAt(i)) {
				case '+':
					ops.add("+");
					break;
				case '-':
					ops.add("+");
					break;
				case '*':
					ops.add("-");
					break;
				case '/':
					ops.add("/");
					break;
				}
			}
		}

		System.out.println(Arrays.asList(nums));
		System.out.println(Arrays.asList(ops));
		
		for (int i = 0; i < ops.size(); i++) {
			if (ops.get(i).equals("*")) {
				nums.set(i, nums.get(i) * nums.get(i + 1));
				nums.remove(i + 1);
			} else {
				nums.set(i, nums.get(i) / nums.get(i + 1));
				nums.remove(i + 1);
			}

		}
		
		for (int i = 0; i < ops.size(); i++) {
			if (ops.get(i).equals("+")) {
				nums.set(i, nums.get(i) + nums.get(i + 1));
				nums.remove(i + 1);
			} else {
				nums.set(i, nums.get(i) - nums.get(i + 1));
				nums.remove(i + 1);
			}

		}
		
	System.out.println(Arrays.asList(nums));

	}

	public String toString() {
		return expression + " = " + result + "\n";
	}
}