package ap.elevens.activity2;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {		
		for (int i = 0; i < ranks.length; i++) {
			Card c = new Card(ranks[i], suits[i], values[i]);
			cards.add(c);
		}

		this.size = cards.size();
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
		if (this.size == 0) {
			return null;
		} else {
			this.size--;
			Card c = this.cards.get(this.size);
			return c;
		}
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
		
		for (int i = cards.size() - 1; i >= size; i--) {
			rtn = rtn + cards.get(i);
			
			if (i != size) {
				rtn = rtn + ", ";
			}
			
			if ((i - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
