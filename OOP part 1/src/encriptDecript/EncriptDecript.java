package encriptDecript;

import java.util.Scanner;

public class EncriptDecript {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[][] key = { { 'B', 'M', 'S', 'J', 'C', },
				         { 'I', 'F', 'N', 'T', 'K', },
				         { 'R', 'L', 'A', 'H', 'E', },
				         { 'D', 'O', 'G', 'Q', 'V', }, 
				         { 'U', 'W', 'X', 'Y', 'P', }, };

		System.out.print("Enter text: ");
		String text = input.next();
		if (text.length() % 2 != 0) {
			text = text + 'p';
		}
		System.out.println(text = text.toUpperCase());
		System.out.print("Entripted text: ");
		System.out.print(text = encripting(text, key));
		System.out.println();
		System.out.print("Decripted text: ");
		 System.out.print(text= decript(text, key));
	}

	public static String encripting(String text, char[][] key) {

		

		char firstChar = 0;
		char secondChar = 0;

		String encriptText = "";

		int firstRow = 0;
		int firstCol = 0;
		int secondRow = 0;
		int secondCol = 0;

		for (int i = 0; i < text.length(); i += 2) {
			firstChar = text.charAt(i);
			secondChar = text.charAt(i + 1);
			for (int row = 0; row < key.length; row++) {
				boolean first=false;
				boolean second=false;
				for (int col = 0; col < key[row].length; col++) {
					if (firstChar == key[row][col]) {
						firstRow = row;
						firstCol = col;
						first=true;
					}
					if (secondChar == key[row][col]) {
						secondRow = row;
						secondCol = col;
						second=true;
					}
				}if(first==true && second ==true){
					break;
				}
			}
			if (firstCol == secondCol) {

				firstRow++;
				secondRow++;

				if (firstRow >= key.length) {
					firstRow = 0;
				}
				if (secondRow >= key.length) {
					secondRow = 0;
				}
				encriptText += key[firstRow][firstCol];
				encriptText += key[secondRow][secondCol];
			} else {
				if (firstRow == secondRow) {
					firstCol++;
					secondCol++;
					if (firstCol >= key.length) {
						firstCol = 0;
					}
					if (secondCol >= key.length) {
						secondCol = 0;
					}
					encriptText += key[firstRow][firstCol];
					encriptText += key[secondRow][secondCol];
				} else {
					encriptText += key[firstRow][secondCol];
					encriptText += key[secondRow][firstCol];
				}
			}
		}
		return encriptText;
	}

	static String decript(String text, char[][] key) {
		

		char firstChar = 0;
		char secondChar = 0;
		String decriptedText = "";
		int firstCharRow = 0;
		int firstCharCol = 0;
		int secCharRow = 0;
		int secCharCol = 0;

		for (int i = 0; i < text.length(); i += 2) {
			firstChar = text.charAt(i);
			secondChar = text.charAt(i + 1);

			for (int row = 0; row < key.length; row++) {
				boolean first= false;
				boolean second= false;
				for (int col = 0; col < key[row].length; col++) {
					if (key[row][col] == firstChar) {
						firstCharRow = row;
						firstCharCol = col;
						first= true;
					}
					if (key[row][col] == secondChar) {
						secCharRow = row;
						secCharCol = col;
						second=true;
					}
				}if(first==true && second ==true){
					break;
				}
			}
			if ((firstCharCol == secCharCol)) {

				firstCharRow--;
				secCharRow--;

				if(firstCharRow<0){
					firstCharRow=key.length-1;
				}
				if(secCharRow<0){
					secCharRow=key.length-1;
				}
				decriptedText += key[firstCharRow][firstCharCol];
				decriptedText += key[secCharRow][secCharCol];
			} 
			else {
				if (firstCharRow == secCharRow) {
					firstCharCol--;
					secCharCol--;
					
					if(firstCharCol<0){
						firstCharCol=key.length-1;
					}
					if(secCharCol<0){
						secCharCol=key.length-1;
					}
					decriptedText += key[firstCharRow][firstCharCol];
					decriptedText += key[secCharRow][secCharCol];
				} else {
					decriptedText += key[firstCharRow][secCharCol];
					decriptedText += key[secCharRow][firstCharCol];
				}
			}
		}
		return decriptedText;
	}

}
