package ap.slides.arraylist16;

import java.util.ArrayList;
import java.util.List;

public class Herd {
	private List<Creature> list;

	public Herd() {
		// point list a new ArrayList
		list = new ArrayList<Creature>();
	}

	public void add(int creatureSize) {
		// add a new Creature to the list
		list.add(new Creature(creatureSize, "monster"));
	}

	/*
	 * method countBigOnes should return the count of big creatures - use the
	 * isBig() Creature method
	 */
	public int countBigOnes() {
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isBig()) count++;
		}
		
		return count;
	}

	public String toString() {
		return "" + list;
	}
}