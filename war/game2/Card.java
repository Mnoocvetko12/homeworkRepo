package war.game2;

public class Card {

	private String suit;
	private String rank;
	private int power;
	
	public Card(String suit, String rank, int power) {
		setSuit(suit);
		setRank(rank);
		setPower(power);
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		if(suit != null)
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		if(rank != null)
		this.rank = rank;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		if(power >= 0 || power <= 12)
		this.power = power;
	}
	
	
	
	
}
