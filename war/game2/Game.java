package war.game2;

import java.util.ArrayList;

public class Game {
	private static final int WAR = 0;
	private static final int SECOND_PLAYER_WIN = -1;
	private static final int FIRST_PLAYER_WIN = 1;
	ArrayList<Card> pOneWinDeck;
	ArrayList<Card> pTwoWinDeck;

	public void gameEngine() throws InterruptedException {
		CardsDeck cd = new CardsDeck();
		cd.shuffleDeck();

		Player ivan = new Player("Ivan");
		Player pesho = new Player("Pesho");

		cd.dealerDeck(ivan, pesho);

//		ivan.printPlayerDeck();
//		System.out.println("\n\n");
//		pesho.printPlayerDeck();
//		System.out.println("\n\n");
		
		
		war(ivan, pesho);
		
		
		System.out.println("\n\n");
		System.out.println(ivan.getName());
		ivan.printPlayerWinDeck();
		System.out.println("\n\n");
		System.out.println(pesho.getName());
		pesho.printPlayerWinDeck();
		System.out.println();

		checkWinner(ivan, pesho);
		
		// cd.printDeck();
	}

	public void war(Player one, Player two) throws InterruptedException {
		pOneWinDeck = new ArrayList<>();
		pTwoWinDeck = new ArrayList<>();
		int countRounds = 1;

		
		while (one.getPlayCards().size() != 0) {
			Thread.sleep(300);

			printPlacedCards(one, two, countRounds);
			// check win for player one
			if (checkForBigger(one, two) == FIRST_PLAYER_WIN) {
				System.out.println(one.getName() + " Win!\n");
				// add object card to the winner deck on player one
				pOneWinDeck.add(one.getCard(0));
				pOneWinDeck.add(two.getCard(0));
				one.removeCard(0);
				two.removeCard(0);
				// end for win check for player one
			} else {
				// check win for player two
				if (checkForBigger(one, two) == SECOND_PLAYER_WIN) {
					System.out.println(two.getName() + " Win!\n");
					// add object card to the winner deck on player two
					pTwoWinDeck.add(one.getCard(0));
					pTwoWinDeck.add(two.getCard(0));
					one.removeCard(0);
					two.removeCard(0);
					// end for win check for player two
				} else {
					// second check when are they equals
					if (checkForBigger(one, two) == WAR) {
						System.out.println("WAR!-------->\n");
						printThreePlacedCard(one, two, countRounds);
						// check for size of arrays are they bigger form 4
						if (one.getPlayCards().size() > 3 || two.getPlayCards().size() > 3) {
							// check third card for winner for player one
							if (checkThirdForBigger(one, two) == FIRST_PLAYER_WIN) {
								System.out.println(one.getName() + " Win!\n");
								// add 4 card for the winner player one
								for (int index = 0; index < 4; index++) {

									pOneWinDeck.add(one.getCard(0));
									pOneWinDeck.add(two.getCard(0));
									one.removeCard(0);
									two.removeCard(0);
								}
								// end check third card for winner for player
								// one
							} else {
								// check third card for winner for player two
								if (checkThirdForBigger(one, two) == SECOND_PLAYER_WIN) {
									System.out.println(two.getName() + " Win!\n");
									// add 4 card for the winner player two
									for (int index = 0; index < 4; index++) {

										pTwoWinDeck.add(one.getCard(0));
										pTwoWinDeck.add(two.getCard(0));
										one.removeCard(0);
										two.removeCard(0);
									}
								}
								else {
									System.out.println("TUKA MI TRQBVA LOGIKA ZA RAVENSTVO MEJDU 3-TITE KARTI ");
									printIfThirdCardsAreEqual(one, two, countRounds);
//									System.out.println("Round " + countRounds + ": " + one.getName() + ": " + one.getCard(4).getRank() + " "
//											+ one.getCard(4).getSuit() + " <---> " + two.getName() + ": " + two.getCard(4).getRank() + " "
//											+ two.getCard(4).getSuit());
									int nextIndex = 4;
									boolean flag = true;
									while(flag) {
										if(checkIfThirdCardsAreEqual(one, two, nextIndex) == FIRST_PLAYER_WIN) {
											System.out.println(one.getName() + " Win!\n");
											for (int index = 0; index <= nextIndex; index++) {

												pOneWinDeck.add(one.getCard(0));
												pOneWinDeck.add(two.getCard(0));
												one.removeCard(0);
												two.removeCard(0);
												flag = false;
											}
										}
										else {
											if(checkIfThirdCardsAreEqual(one, two, nextIndex) == SECOND_PLAYER_WIN) {
												System.out.println(two.getName() + " Win!\n");
												for (int index = 0; index <= nextIndex; index++) {

													pTwoWinDeck.add(one.getCard(0));
													pTwoWinDeck.add(two.getCard(0));
													one.removeCard(0);
													two.removeCard(0);
													flag = false;
												}
											}
											else {
												nextIndex++;
												
											}
										}
									}
									
									
								}
								// end check third card for winner for player
								// two
							}
						}
//						 else if array.size < 4
						else {
							if (one.getPlayCards().size() == 3 || two.getPlayCards().size() == 3) {

								System.out.println(
										"Round " + countRounds + ": " + one.getName() + ": " + one.getCard(1).getRank()
												+ " " + one.getCard(1).getSuit() + " <---> " + two.getName() + ": "
												+ two.getCard(1).getRank() + " " + two.getCard(1).getSuit());

								if (one.getCard(1).getPower() > two.getCard(1).getPower()) {
									System.out.println(one.getName() + " Win!\n");
									for (int index = 0; index < 2; index++) {
										pOneWinDeck.add(one.getCard(0));
										pOneWinDeck.add(two.getCard(0));
										one.removeCard(0);
										two.removeCard(0);
									}

								} else {

									if (one.getCard(1).getPower() < two.getCard(1).getPower()) {
										System.out.println(two.getName() + " Win!\n");
										for (int index = 0; index < 2; index++) {
											pTwoWinDeck.add(one.getCard(0));
											pTwoWinDeck.add(two.getCard(0));
											one.removeCard(0);
											two.removeCard(0);
										}
									} else {

										System.out.println("Round " + countRounds + ": " + one.getName() + ": "
												+ one.getCard(2).getRank() + " " + one.getCard(2).getSuit() + " <---> "
												+ two.getName() + ": " + two.getCard(2).getRank() + " "
												+ two.getCard(2).getSuit());

										if (one.getCard(2).getPower() > two.getCard(2).getPower()) {
											System.out.println(one.getName() + " Win!\n");
											for (int index = 0; index < 3; index++) {
												pOneWinDeck.add(one.getCard(0));
												pOneWinDeck.add(two.getCard(0));
												one.removeCard(0);
												two.removeCard(0);
											}

										} else {
											if (one.getCard(2).getPower() < two.getCard(2).getPower()) {
												System.out.println(two.getName() + " Win!\n");
												for (int index = 0; index < 3; index++) {
													pTwoWinDeck.add(one.getCard(0));
													pTwoWinDeck.add(two.getCard(0));
													one.removeCard(0);
													two.removeCard(0);
												}
											} else {
												if (one.getCard(3).getPower() > two.getCard(3).getPower()) {
													System.out.println(one.getName() + " Win!\n");
													for (int index = 0; index < 4; index++) {
														pOneWinDeck.add(one.getCard(0));
														pOneWinDeck.add(two.getCard(0));
														one.removeCard(0);
														two.removeCard(0);
													}

												} else {
													if (one.getCard(3).getPower() < two.getCard(3).getPower()) {
														System.out.println(two.getName() + " Win!\n");
														for (int index = 0; index < 4; index++) {
															pTwoWinDeck.add(one.getCard(0));
															pTwoWinDeck.add(two.getCard(0));
															one.removeCard(0);
															two.removeCard(0);
														}
													} else {
														System.out.println(
																"Dano nikoga ne stigne do tuk!!!! Poslednata vrytka da e ravna");
														break;
													}
												}
											}
										}
									}
								}

							} else {
								if (one.getPlayCards().size() == 2 || two.getPlayCards().size() == 2) {
									System.out.println("Round " + countRounds + ": " + one.getName() + ": "
											+ one.getCard(1).getRank() + " " + one.getCard(1).getSuit() + " <---> "
											+ two.getName() + ": " + two.getCard(1).getRank() + " "
											+ two.getCard(1).getSuit());

									if (one.getCard(1).getPower() > two.getCard(1).getPower()) {
										System.out.println(one.getName() + " Win!\n");
										for (int index = 0; index < 2; index++) {
											pOneWinDeck.add(one.getCard(0));
											pOneWinDeck.add(two.getCard(0));
											one.removeCard(0);
											two.removeCard(0);
										}

									} else {

										if (one.getCard(1).getPower() < two.getCard(1).getPower()) {
											System.out.println(two.getName() + " Win!\n");
											for (int index = 0; index < 2; index++) {
												pTwoWinDeck.add(one.getCard(0));
												pTwoWinDeck.add(two.getCard(0));
												one.removeCard(0);
												two.removeCard(0);
											}
										} else {

											System.out.println("Round " + countRounds + ": " + one.getName() + ": "
													+ one.getCard(2).getRank() + " " + one.getCard(2).getSuit()
													+ " <---> " + two.getName() + ": " + two.getCard(2).getRank() + " "
													+ two.getCard(2).getSuit());

											if (one.getCard(2).getPower() > two.getCard(2).getPower()) {
												System.out.println(one.getName() + " Win!\n");
												for (int index = 0; index < 3; index++) {
													pOneWinDeck.add(one.getCard(0));
													pOneWinDeck.add(two.getCard(0));
													one.removeCard(0);
													two.removeCard(0);
												}

											} else {
												if (one.getCard(2).getPower() < two.getCard(2).getPower()) {
													System.out.println(two.getName() + " Win!\n");
													for (int index = 0; index < 3; index++) {
														pTwoWinDeck.add(one.getCard(0));
														pTwoWinDeck.add(two.getCard(0));
														one.removeCard(0);
														two.removeCard(0);
													}
												}

												else {
													System.out.println(
															"Dano nikoga ne stigne do tuk!!!! Poslednata vrytka da e ravna");
													break;
												}
											}
										}
									}
								}
								else {
									if(one.getPlayCards().size() == 1 || two.getPlayCards().size() == 1) {
										System.out.println("Poslednite karti da sa ravni!");
										pOneWinDeck.add(one.getCard(0));
										pTwoWinDeck.add(two.getCard(0));
										one.removeCard(0);
										two.removeCard(0);
										break;
									}
								}
							}
						}
					}
				}

				// end check for size of arrays are they bigger form 4
			}
			// end second check when are they equals

			one.setWinCard(pOneWinDeck);
			two.setWinCard(pTwoWinDeck);
			countRounds++;
		
			}
		
		}
	
	private void checkWinner(Player one, Player two) {
		if(one.getWinCard().size() > two.getWinCard().size()){
			System.out.println(one.getName() + "! Win the game with " + one.getWinCard().size() + " on " + two.getWinCard().size() + " cards!!!");
		}
		else {
			if(one.getWinCard().size() < two.getWinCard().size()) {
				System.out.println(two.getName() + "! Win the game with " + two.getWinCard().size() + " on " + one.getWinCard().size() + " cards!!!");
			}
			else {
				System.out.println(one.getWinCard().size() + " on " + two.getWinCard().size() + " cards. The game is equal!!!");
			}
		}
	}
		
	private int checkIfThirdCardsAreEqual(Player one, Player two, int nextIndex) {
		if (one.getCard(nextIndex).getPower() > two.getCard(nextIndex).getPower()) {
			return FIRST_PLAYER_WIN;
		} else {
			if (one.getCard(nextIndex).getPower() < two.getCard(nextIndex).getPower()) {
				return SECOND_PLAYER_WIN;
			} else {
				return WAR;
			}

		}
	}

	private int checkThirdForBigger(Player one, Player two) {
		if (one.getCard(3).getPower() > two.getCard(3).getPower()) {
			return FIRST_PLAYER_WIN;
		} else {
			if (one.getCard(3).getPower() < two.getCard(3).getPower()) {
				return SECOND_PLAYER_WIN;
			} else {
				return WAR;
			}

		}
	}

	private int checkForBigger(Player one, Player two) {
		if (one.getCard(0).getPower() > two.getCard(0).getPower()) {
			return FIRST_PLAYER_WIN;
		} else {
			if (one.getCard(0).getPower() < two.getCard(0).getPower()) {
				return SECOND_PLAYER_WIN;
			} else {
				return WAR;
			}

		}
	}
	
	private void printIfThirdCardsAreEqual(Player one, Player two, int countRounds) {
		System.out.println("Round " + countRounds + ": " + one.getName() + ": " + one.getCard(4).getRank() + " "
				+ one.getCard(4).getSuit() + " <---> " + two.getName() + ": " + two.getCard(4).getRank() + " "
				+ two.getCard(4).getSuit());
	}

	private void printThreePlacedCard(Player one, Player two, int countRounds) {

		if (one.getPlayCards().size() > 4 || two.getPlayCards().size() > 4) {
			for (int index = 1; index < 4; index++) {

				System.out.println("Round " + countRounds + ": " + one.getName() + ": " + one.getCard(index).getRank() + " "
						+ one.getCard(index).getSuit() + " <---> " + two.getName() + ": " + two.getCard(index).getRank()
						+ " " + two.getCard(index).getSuit());

			}
		}
	}

	private void printPlacedCards(Player one, Player two, int countRounds) {
//		int temp = one.getPlayCards().size() - 1;
//		System.out.println("deck size " + temp);
		System.out.println("Round " + countRounds + ": " + one.getName() + ": " + one.getCard(0).getRank() + " "
				+ one.getCard(0).getSuit() + " <---> " + two.getName() + ": " + two.getCard(0).getRank() + " "
				+ two.getCard(0).getSuit());
	}

	
}
