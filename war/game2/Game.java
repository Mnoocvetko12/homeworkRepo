package war.game2;

import java.util.ArrayList;

public class Game {
	ArrayList<Card> pOneWinDeck;
	ArrayList<Card> pTwoWinDeck;

	public void gameEngine() {
		CardsDeck cd = new CardsDeck();
		cd.shuffleDeck();

		Player ivan = new Player("Ivan");
		Player pesho = new Player("Pesho");

		cd.dealerDeck(ivan, pesho);

		ivan.printPlayerDeck();
		System.out.println("\n\n");
		pesho.printPlayerDeck();
		System.out.println("\n\n");
		war(ivan, pesho);
		System.out.println("\n\n");
		ivan.printPlayerWinDeck();
		System.out.println("\n\n");
		pesho.printPlayerWinDeck();

//		cd.printDeck();
	}

	public void war(Player one, Player two) {
		pOneWinDeck = new ArrayList<>();
		pTwoWinDeck = new ArrayList<>();
		int count = 1;
		while (true) {
			if(count == 27) {
				break;
			}
			try {
				System.out.println(count + " " + one.getName() + " " + one.getCard(0).getRank() + " " + one.getCard(0).getSuit() + 
						" <---> " + two.getName() + " " + two.getCard(0).getRank() + " " + two.getCard(0).getSuit());
				if (one.getCard(0).getPower() > two.getCard(0).getPower()) {
					pOneWinDeck.add(one.getCard(0));
					pOneWinDeck.add(two.getCard(0));
					one.removeCard(0);
					two.removeCard(0);
					count++;
				} else {
					if (one.getCard(0).getPower() < two.getCard(0).getPower()) {
						pTwoWinDeck.add(one.getCard(0));
						pTwoWinDeck.add(two.getCard(0));
						one.removeCard(0);
						two.removeCard(0);
						count++;
					} else {
						break;
					
					}
				}
			} catch (NullPointerException e) {
				e.getMessage();
			}
			
			

		}
		one.setWinCard(pOneWinDeck);
		two.setWinCard(pTwoWinDeck);

	}
	
	

}
