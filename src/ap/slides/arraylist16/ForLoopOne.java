package ap.slides.arraylist16;
//(c) A+ Computer Science

import java.util.ArrayList;

// www.apluscompsci.com

//for loop example 1

public class ForLoopOne {
	public static void main(String args[]) {
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);
		ray.add(111);
		ray.add(336);
		ray.add(763);

		for (int i = 0; i < ray.size(); i++) {
			System.out.println(ray.get(i));
			ray.set(i, ray.get(i) + 1);
		}
		
		System.out.println("after" + ray);
	}
}