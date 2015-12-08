package stringsExercises;

import java.util.Scanner;

public class ExerciseThree {

	/*
	 * 3. Да се състави програма, която чете набор от думи, разделени с
	 * интервал. Като резултат да се извеждат броя на въведените думи, както и
	 * броя знаци в най-дългата дума.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter words with spaces: ");
		String text = input.nextLine();
		
		String[] words = text.split(" ");
		int wordsCount = words.length;
		int maxCharsWord = 0;
		
		
		for (int i = 0; i < words.length; i++) {
			if(maxCharsWord < words[i].length()) {
				maxCharsWord = words[i].length();
			}
		}
		
		System.out.println(text);
		System.out.println("Words are: " + wordsCount);
		System.out.println("Max word length is: " + maxCharsWord);

	}

}
