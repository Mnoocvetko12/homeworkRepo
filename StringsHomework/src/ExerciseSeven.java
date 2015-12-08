import java.util.Scanner;

public class ExerciseSeven {

	/*
	 * Да се състави програма, която чете набор от думи разделени с интервал.
	 * Като резултат да се извеждат броя на въведените думи, както и броя знаци
	 * в най-дългата дума.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter few words divided by space: ");
		String words = input.nextLine();

		countWordsAndLetters(words);

	}

	public static void countWordsAndLetters(String words) {

		String[] word = words.split(" ");

		int countWords = word.length;
		int countLetters = 0;
		int maxCountLetters = 0;

		for (int i = 0; i < word.length; i++) {
			countLetters = word[i].length();
			if (maxCountLetters < countLetters) {
				maxCountLetters = countLetters;
			}

		}

		System.out.printf("%d words, max length %d letters.", countWords, maxCountLetters);
	}

}
