package excerciseThree;

import java.util.Scanner;

public class Encript {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.next();

		char[][] key = {{ 'B', 'M', 'S', 'J', 'C', }, 
	                    { 'I', 'F', 'N', 'T', 'K', },
	                    { 'R', 'L', 'A', 'H', 'E', }, 
	                    { 'D', 'O', 'G', 'Q', 'V', }, 
	                    { 'U', 'W', 'X', 'Y', 'P', },};
		

		System.out.println(text = textToUpperCase(text));

		System.out.println(text = encripting(text, key));
		
		System.out.println(text = decripting(text, key));

	}
	
	
	
	public static String textToUpperCase(String text) {
		if (text.length() % 2 != 0) {
			text += "p";
		}
		text = text.toUpperCase();
		
		return text;
	}

	public static String encripting(String text, char[][] key) {

	

		char firstChar = 0;
		char secondChar = 0;

		String newText = "";

		int firstRow = 0;
		int firstCol = 0;
		int secondRow = 0;
		int secondCol = 0;

		
		// get elements from text
		for (int i = 0; i < text.length(); i += 2) {
			firstChar = text.charAt(i);
			secondChar = text.charAt(i + 1);
			
			//find coordinates of two elements 
			for (int row = 0; row < key.length; row++) {
				for (int col = 0; col < key[row].length; col++) {
					if (firstChar == key[row][col]) {
						firstRow = row;
						firstCol = col;
					}
					if (secondChar == key[row][col]) {
						secondRow = row;
						secondCol = col;
					}
				}
			}
			//check for two elements on one col
			if (firstCol == secondCol) {

				firstRow++;
				secondRow++;

				if (firstRow >= key.length) {
					firstRow = 0;
				}
				if (secondRow >= key.length) {
					secondRow = 0;
				}

			}

			if (firstRow == secondRow) {
				firstCol++;
				secondCol++;
				if (firstCol >= key.length) {
					firstCol = 0;
				}
				if (secondCol >= key.length) {
					secondCol = 0;
				}
				newText += key[firstRow][firstCol];
				newText += key[secondRow][secondCol];

			} else {
				newText += key[firstRow][secondCol];
				newText += key[secondRow][firstCol];
			}

		}


		return newText;
	}
	
	public static String decripting(String text, char[][] key) {
		
//		char[][] decripting = {{ 'B', 'M', 'S', 'J', 'C', }, 
//	                           { 'I', 'F', 'N', 'T', 'K', },
//	                           { 'R', 'L', 'A', 'H', 'E', }, 
//	                           { 'D', 'O', 'G', 'Q', 'V', }, 
//	                           { 'U', 'W', 'X', 'Y', 'P', },};
		
		char firstChar = 0;
		char secondChar = 0;

		String newText = "";

		int firstRow = 0;
		int firstCol = 0;
		int secondRow = 0;
		int secondCol = 0;
		
		for (int i = 0; i < text.length(); i += 2) {
			firstChar = text.charAt(i);
			secondChar = text.charAt(i + 1);
			for (int row = 0; row < key.length; row++) {
				for (int col = 0; col < key[row].length; col++) {
					if (firstChar == key[row][col]) {
						firstRow = row;
						firstCol = col;
					}
					if (secondChar == key[row][col]) {
						secondRow = row;
						secondCol = col;
					}
				}
			}
			
			if (firstCol == secondCol) {

				firstRow--;
				secondRow--;
				
				if(firstRow < 0) {
					firstRow = key.length -1;
				}
				if(secondRow < 0) {
					firstRow = key.length -1;
				}

			}
			
			if(firstRow == secondRow) {
				firstCol--;
				secondCol--;
				
				if(firstCol < 0) {
					firstCol = key.length - 1;
				}
				if(secondCol < 0) {
					secondCol = key.length - 1;
				}
				
				newText += key[firstRow][firstCol];
				newText += key[secondRow][secondCol];
			}
			else {
				newText += key[firstRow][secondCol];
				newText += key[secondRow][firstCol];
			}
			
			
			
		}
		return newText;
	}
	


}
