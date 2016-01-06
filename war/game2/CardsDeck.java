package war.game2;

import java.util.ArrayList;
import java.util.Collections;

public class CardsDeck {

	private String[] suit = {"club", "diamond", "heart", "spade"};
	private String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",};
	private ArrayList<Card> cardDeck;
	
	
	
	
	public CardsDeck() {
		cardDeck = new ArrayList<>();
		
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				cardDeck.add(new Card(suit[i], rank[j], j));
				
			}
		}			
	}
	
	public void printDeck() {
		for (Card card : cardDeck) {
			System.out.println(card.getRank() + " " + card.getSuit() + " --> " + card.getPower());
		}
	}	
	
	public void shuffleDeck() {
		Collections.shuffle(cardDeck);
		
	}
	
	public void dealerDeck(Player one, Player two) {
		ArrayList<Card> firstDeck = new ArrayList<>();
		ArrayList<Card> secondDeck = new ArrayList<>();
		
		for (int i = 0; i < cardDeck.size(); i++) {
			if(i % 2 == 0) {
				firstDeck.add(cardDeck.get(i));
			}
			else {
				secondDeck.add(cardDeck.get(i));
			}
		}
		
		one.setPlayCards(firstDeck);
		two.setPlayCards(secondDeck);
		
		
	}
	
}
