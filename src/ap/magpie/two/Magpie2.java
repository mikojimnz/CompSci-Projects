package ap.magpie.two;

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";

		if (statement.trim().length() == 0)
			return "Say something please";

		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0) {
			response = "Tell me more about your pets";
		} else if (statement.toLowerCase().indexOf("mr.") >= 0 && statement.indexOf("teacher") >= 0) {
			response = "He seems like a good teacher";
		} else if (statement.toLowerCase().indexOf("mrs.") >= 0
				|| statement.toLowerCase().indexOf("ms.") >= 0 && statement.indexOf("teacher") >= 0) {
			response = "She seems like a good teacher";
		} else {
			response = getRandomResponse();
		}

		return response;

	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		switch (whichResponse) {
		default:
		case 0:
			response = "Hmmm.";
			break;
		case 1:
			response = "Do you really think so?";
			break;
		case 2:
			response = "You don't say.";
			break;
		case 3:
			response = "Thats cool!";
			break;
		case 4:
			response = "Huh.";
			break;
		}

		return response;
	}
}
