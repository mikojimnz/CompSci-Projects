package ap.elevens.activity2;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private ArrayList<Card> dealtCards = new ArrayList<Card>();
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
			Card c = new Card(this.ranks.get(i), this.suits.get(i), this.values.get(i));
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
			Card c = this.cards.remove(this.size);
			this.dealtCards.add(c);
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
		for (int k = dealtCards.size() - 1; k >= size; k--) {
			rtn = rtn + dealtCards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - dealtCards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
