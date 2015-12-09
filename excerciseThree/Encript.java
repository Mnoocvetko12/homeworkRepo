package excerciseThree;

import java.util.Scanner;

public class Encript {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.next();

		

		System.out.println(text = textToUpperCase(text));

		
		System.out.println(text = encripting(text));
		
		

	}
	
	public static String textToUpperCase(String text) {
		if (text.length() % 2 != 0) {
			text += "c";
		}
		text = text.toUpperCase();
		
		return text;
	}

	public static String encripting(String text) {

		char[][] encripting = {{ 'B', 'M', 'S', 'J', 'C', }, 
				               { 'I', 'F', 'N', 'T', 'K', },
				               { 'R', 'L', 'A', 'H', 'E', }, 
				               { 'D', 'O', 'G', 'Q', 'V', }, 
				               { 'U', 'W', 'X', 'Y', 'P', },};

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
			for (int row = 0; row < encripting.length; row++) {
				for (int col = 0; col < encripting[row].length; col++) {
					if (firstChar == encripting[row][col]) {
						firstRow = row;
						firstCol = col;
					}
					if (secondChar == encripting[row][col]) {
						secondRow = row;
						secondCol = col;
					}
				}
			}

			if (firstCol == secondCol) {

				firstRow++;
				secondRow++;

				if (firstRow >= encripting.length) {
					firstRow = 0;
				}
				if (secondRow >= encripting.length) {
					secondRow = 0;
				}

			}

			if (firstRow == secondRow) {
				firstCol++;
				secondCol++;
				if (firstCol >= encripting.length) {
					firstCol = 0;
				}
				if (secondCol >= encripting.length) {
					secondCol = 0;
				}
				newText += encripting[firstRow][firstCol];
				newText += encripting[secondRow][secondCol];

			} else {
				newText += encripting[firstRow][secondCol];
				newText += encripting[secondRow][firstCol];
			}

		}


		return newText;
	}
	


}
