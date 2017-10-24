package ap.elevens.activity2;

public class DeckTester {

	public static void main(String[] args) {
		String[] ranks = new String[] { "A", "K", "Q", "J", "10", "9", "8", "7" };
		String[] suits = new String[] { "Hearts", "Spades", "Diamonds", "Clubs", "Hearts", "Spades", "Diamonds",
				"Clubs" };
		int[] values = new int[] { 11, 10, 9, 8, 7, 6, 5, 4 };

		Deck d = new Deck(ranks, suits, values);
		d.shuffle();
		d.shuffle();
		d.shuffle();
		
		System.out.println(d);
	}
}
