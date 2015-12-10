
import java.util.Scanner;

public class EncriptDecript {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter text: ");
		String text = input.next();
		if (text.length() % 2 != 0) {
			text = text + 'p';
		}
		System.out.println(text = text.toUpperCase());
		System.out.print("Entripted text: ");
		System.out.print(text = encripting(text));
		System.out.println();
		System.out.print("Decripted text: ");
		 System.out.print(text= decript(text));
	}

	public static String encripting(String text) {

		char[][] encripting = { { 'B', 'M', 'S', 'J', 'C', },
								{ 'I', 'F', 'N', 'T', 'K', },
								{ 'R', 'L', 'A', 'H', 'E', },
								{ 'D', 'O', 'G', 'Q', 'V', }, 
								{ 'U', 'W', 'X', 'Y', 'P', }, };

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
				boolean first=false;
				boolean second=false;
				for (int col = 0; col < encripting[row].length; col++) {
					if (firstChar == encripting[row][col]) {
						firstRow = row;
						firstCol = col;
						first=true;
					}
					if (secondChar == encripting[row][col]) {
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

				if (firstRow >= encripting.length) {
					firstRow = 0;
				}
				if (secondRow >= encripting.length) {
					secondRow = 0;
				}
				newText += encripting[firstRow][firstCol];
				newText += encripting[secondRow][secondCol];
			} else {
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
		}
		return newText;
	}

	static String decript(String newText) {
		char[][] decripting = { { 'B', 'M', 'S', 'J', 'C', }, 
								{ 'I', 'F', 'N', 'T', 'K', },
								{ 'R', 'L', 'A', 'H', 'E', },
								{ 'D', 'O', 'G', 'Q', 'V', },
								{ 'U', 'W', 'X', 'Y', 'P', }, };

		char firstChar = 0;
		char secondChar = 0;
		String decriptedText = "";
		int firstCharRow = 0;
		int firstCharCol = 0;
		int secCharRow = 0;
		int secCharCol = 0;

		for (int i = 0; i < newText.length(); i += 2) {
			firstChar = newText.charAt(i);
			secondChar = newText.charAt(i + 1);

			for (int row = 0; row < decripting.length; row++) {
				boolean first= false;
				boolean second= false;
				for (int col = 0; col < decripting[row].length; col++) {
					if (decripting[row][col] == firstChar) {
						firstCharRow = row;
						firstCharCol = col;
						first= true;
					}
					if (decripting[row][col] == secondChar) {
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
					firstCharRow=decripting.length-1;
				}
				if(secCharRow<0){
					secCharRow=decripting.length-1;
				}
				decriptedText += decripting[firstCharRow][firstCharCol];
				decriptedText += decripting[secCharRow][secCharCol];
			} 
			else {
				if (firstCharRow == secCharRow) {
					firstCharCol--;
					secCharCol--;
					
					if(firstCharCol<0){
						firstCharCol=decripting.length-1;
					}
					if(secCharCol<0){
						secCharCol=decripting.length-1;
					}
					decriptedText += decripting[firstCharRow][firstCharCol];
					decriptedText += decripting[secCharRow][secCharCol];
				} else {
					decriptedText += decripting[firstCharRow][secCharCol];
					decriptedText += decripting[secCharRow][firstCharCol];
				}
			}
		}
		return decriptedText;
	}

}
