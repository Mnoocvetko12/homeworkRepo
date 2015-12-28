package war.game2;

import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<Card> playCards;
	private ArrayList<Card> winCard;
	
	
	
	public Player(String name) {
		setName(name);
	}
	
	public void printPlayerDeck() {
		int count = 1;
		for (Card card : playCards) {
			System.out.println(count + " " + card.getRank() + " " + card.getSuit());
			count++;
		}
	}
	
	public void printPlayerWinDeck() {
		int count = 1;
		for (Card card : winCard) {
			System.out.println(count + " " + card.getRank() + " " + card.getSuit());
			count++;
		}
	}
	
	public Card getCard(int i) {	
		return playCards.get(i);
		
	}
	
	public void removeCard(int i) {
		playCards.remove(i);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
	public ArrayList<Card> getPlayCards() {
		return playCards;
	}
	public void setPlayCards(ArrayList<Card> playCards) {
		this.playCards = playCards;
	}
	public ArrayList<Card> getWinCard() {
		return winCard;
	}
	public void setWinCard(ArrayList<Card> winCard) {
		this.winCard = winCard;
	}
	
	
}
