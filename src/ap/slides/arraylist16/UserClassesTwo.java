package ap.slides.arraylist16;
//(c) A+ Computer Science

// www.apluscompsci.com

//ArrayList user defined classes example one

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class UserClassesTwo {
	public static void main(String[] args) {
		ArrayList<Creature> creatureList = new ArrayList<Creature>();
		creatureList.add(new Creature(22, null));
		creatureList.add(new Creature(11, null));
		// add 3 more creatures to creatureList

		Collections.sort(creatureList); // will throw an exception until
										// creatures are added to the array

		for (Creature it : creatureList) {
			out.println(it);
		}

		creatureList.get(0).setSize(41);
		out.println(creatureList.get(0).toString()); // toString called automatically
														// but,this makes a good demo

		Creature dude = new Creature(41, null);
		out.println(creatureList.indexOf(dude));
		out.println(creatureList.contains(dude));
		out.println(creatureList.isEmpty());
	}
}