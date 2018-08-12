package bolum07;

public class DeckOfCard {

	public static void main(String[] args) {

		final int deckSeries = 52;
		int[] deck = new int[deckSeries]; // create array deck
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" }; // array of strings
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" }; // array of
																											// strings

		// Initialize the cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// Shuffle the Card
		for (int i = 0; i < deck.length; i++) {
			int randomIndex = (int) (Math.random() * 52);
			int temp = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;

		}

		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
