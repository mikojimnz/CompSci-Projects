package ap.elevens.activity1;

public class Card {

	private String rank;
	private String suit;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		this.rank = cardRank;
		this.suit = cardSuit;
		this.pointValue = cardPointValue;
	}

	public String suit() {
		return rank;
	}

	public String rank() {
		return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		if (this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit)
				&& this.pointValue == otherCard.pointValue) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
