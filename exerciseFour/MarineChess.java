package exerciseFour;

import java.util.Scanner;

public class MarineChess {
	
	//this is the game method here the players make their moves
	public static void game(char[][] table) {
		Scanner input = new Scanner(System.in);

		char checkChar = 0;
		int row = 0;
		int col = 0;
		
		while (true) {

			do {
				checkChar = 'X';
				printTable(table);

				System.out.print("Player one move: ");
				row = input.nextInt();
				col = input.nextInt();
				if (validMove(row, col) && checkForEmpty(row, col, table)) {
					table[row][col] = checkChar;
					break;
				}

			} while (!validMove(row, col) || !checkForEmpty(row, col, table));

			if (winRow(table, checkChar) || winCol(table, checkChar) || mainDiag(table, checkChar) || secondDiag(table, checkChar)) {
				printTable(table);
				System.out.println("First player win!!!");
				return;
			}

			if (isFull(table)) {
				printTable(table);
				System.out.println("The game is tie!");
				return;
			}

			do {
				checkChar = 'O';
				printTable(table);

				System.out.print("Player two move: ");

				row = input.nextInt();
				col = input.nextInt();
				if (validMove(row, col) && checkForEmpty(row, col, table)) {
					table[row][col] = checkChar;
					break;
				}
			} while (!validMove(row, col) || !checkForEmpty(row, col, table));

			if (winRow(table, checkChar) || winCol(table, checkChar) || mainDiag(table, checkChar) || secondDiag(table, checkChar)) {
				printTable(table);
				System.out.println("Second player win!!!");
				return;
			}
		}
	}

	// this method check for full table if it's full return true
	public static boolean isFull(char[][] table) {

		for (int row = 1; row < table.length; row++) {
			for (int col = 1; col < table[row].length; col++) {
				if (table[row][col] == '*')  {
					return false;
				}
			}
		}
		return true;
	}
	
	// this method check for valid move if position is empty return true
	public static boolean checkForEmpty(int row, int col, char[][] table) {

		if (validMove(row, col) && table[row][col] == '*') {
			return true;
		}
		return false;
	}
	
	// this method make matrix visible for players
	public static void printTable(char[][] table) {
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + " ");
			}
			System.out.println();
		}
	}

	//this method check for valid row or col input
	public static boolean validMove(int row, int col) {

		if ((row > 0 || row < 4) || (col > 0 || col < 4)) {
			return true;
		}
		return false;
	}

	//this method check for row win if any row has three equals elements game is over
	public static boolean winRow(char[][] table, char ch) {
		int count = 0;
		for (int row = 1; row < table.length; row++) {
			for (int col = 1; col < table.length; col++) {
				if (table[row][col] == ch) {
					count++;
					if (count == 3) {
						return true;
					}
				} else {
					count = 0;
					break;
				}
			}

		}
		return false;
	}

	//this method check for col win if any col has three equals elements game is over
	public static boolean winCol(char[][] table, char ch) {
		int count = 0;
		for (int col = 1; col < table.length; col++) {
			for (int row = 1; row < table.length; row++) {
				if (table[row][col] == ch) {
					count++;
					if (count == 3) {
						return true;
					}
				} else {
					count = 0;
					break;
				}
			}
		}
		return false;
	}

	//this method check for win on first diagonal if it is true game is over
	public static boolean mainDiag(char[][] table, char ch) {
		int count = 0;
		for (int row = 1; row < table.length; row++) {
			for (int col = 1; col < table.length; col++) {
				if (table[row][col] == ch && row == col) {
					count++;
					if (count == 3) {
						return true;
			 		}
				}
			}
		}
		return false;
	}
	
	//this method check for win on second diagonal it is true game is over
	public static boolean secondDiag(char[][] table, char ch) {
		int count = 0;
		for (int row = 1; row < table.length; row++) {
			for (int col = 1; col < table.length; col++) {
				if(table[row][col] == ch && row + col == table.length) {
					count++;
					if(count == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
