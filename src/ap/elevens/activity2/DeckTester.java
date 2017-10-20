package ap.elevens.activity2;

public class DeckTester {

	public static void main(String[] args) {
		String[] ranks = new String[] { "A", "K", "Q" };
		String[] suits = new String[] { "Hearts", "Spades", "Diamonds" };
		int[] values = new int[] { 11, 10, 9 };

		Deck d = new Deck(ranks, suits, values);
		d.deal();
		System.out.println(d);
	}
}
