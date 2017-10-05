package ap.labs.arraylist16;

import java.util.List;

public class ListDown {
	public static boolean go(List<Integer> numArray) {
		int start = numArray.get(0);

		if (numArray.size() == 1)
			return true;

		for (int i = 0; i < numArray.size(); i++) {
			if (start < numArray.get(i)) {
				return false;
			} else {
				start = numArray.get(i);
			}
		}

		return true;
	}
}