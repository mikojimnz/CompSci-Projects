package ap.elevens.activity1;

public class CardTester {

	public static void main(String[] args) {
		Card c1 = new Card("A", "Hearts", 11);
		Card c2 = new Card("A", "Hearts", 11);
		Card c3 = new Card("Q", "Diamonds", 9);
		
		if (c1.matches(c2)) {
			System.out.println("Matches");
		} else {
			System.out.println("Does not match");
		}
		
		if (c1.matches(c3)) {
			System.out.println("Matches");
		} else {
			System.out.println("Does not match");
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
