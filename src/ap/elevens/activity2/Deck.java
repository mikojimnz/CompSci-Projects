package ap.elevens.activity2;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards;
	private ArrayList<String> ranks = new ArrayList<String>();
	private ArrayList<String> suits = new ArrayList<String>();
	private ArrayList<Integer> values = new ArrayList<Integer>();
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		for (String i : ranks) {
			this.ranks.add(i);
		}
		
		for (String i : suits) {
			this.suits.add(i);
		}
		
		for (int i : values) {
			this.values.add(i);
		}
		
		for (int i = 0; i < this.ranks.size(); i++) {
			cards.add(new Card(this.ranks.get(i), this.suits.get(i), this.values.get(i)));
		}
	}

	public boolean isEmpty() {
		return cards.size() == 0 ? true : false;
	}

	public int size() {
		return cards.size();
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	public Card deal() {
		int random = (int) Math.random() * cards.size();
		Card card = cards.get(random);
		cards.remove(random);
		return card;
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
