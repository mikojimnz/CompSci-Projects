package ap.magpie.four;

public class Magpie4 {
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";
		if (statement.length() == 0) {
			response = "Say something, please.";
		} else if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		} else if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (findKeyword(statement, "cat") >= 0 || findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cats") >= 0 || findKeyword(statement, "dogs") >= 0) {
			response = "Tell me more about your pets.";
		} else if (findKeyword(statement, "I want to") >= 0) {
			response = "Would you really like to " + statement.substring(9).trim() + "?";
		} else if (findKeyword(statement, "I want") >= 0) {
			response = "Do you really want " + statement.substring(6).trim() + "?";
		} else if (findKeyword(statement, "i") >= 0) {
			response = "Why do you " + statement.substring(2).replace("you", "me").trim() + "?";
		} else if (findKeyword(statement, "Do you") >= 0) {
			response = "Why do you " + statement.substring(6).trim();
		} else if (findKeyword(statement, "you are") >= 0) {
			response = "Why am I " + statement.substring(7).replace("are", "").trim();
		} else if (findKeyword(statement, "you") >= 0) {
			response = "Why do I " + statement.substring(4).replace("me", "").trim() + " you?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0) {
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}

			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}

	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}

}
