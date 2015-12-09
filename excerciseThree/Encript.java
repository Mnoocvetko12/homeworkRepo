package excerciseThree;



public class Encript {

	public static void main(String[] args) {

		char[][] encripting = {{ 'B', 'M', 'S', 'J', 'C', }, 
				               { 'I', 'F', 'N', 'T', 'K', },
				               { 'R', 'L', 'A', 'H', 'E', }, 
				               { 'D', 'O', 'G', 'Q', 'V', }, 
				               { 'U', 'W', 'X', 'Y', 'P', },};

		String text = "textmextdg";

		if (text.length() % 2 != 0) {
			text += "c";
		}
		text = text.toUpperCase();

		System.out.println(text);

		char firstChar = 0;
		char secondChar = 0;

		String newText = "";

		int firstRow = 0;
		int firstCol = 0;
		int secondRow = 0;
		int secondCol = 0;
		int row = 0;
		int col = 0;

		for (int i = 0; i < text.length(); i += 2) {
			firstChar = text.charAt(i);
			secondChar = text.charAt(i + 1);
			for (row = 0; row < encripting.length; row++) {
				for (col = 0; col < encripting[row].length; col++) {
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
				
				if(firstRow >= encripting.length) {
					firstRow = 0;
				}
				if(secondRow >= encripting.length) {
					secondRow = 0;
				}
				
				

			}
			

			if (firstRow == secondRow) {
				firstCol++;
				secondCol++;
				
			}

			newText += encripting[firstRow][firstCol];
			newText += encripting[secondRow][secondCol];

		}

		System.out.println(newText);
	
	}

}
