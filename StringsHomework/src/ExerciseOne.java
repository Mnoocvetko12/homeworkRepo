import java.util.Scanner;

public class ExerciseOne {

	/*
	 * Да се състави програма, чрез която се въвеждат два низа съдържащи до 40
	 * главни и малки букви. Като резултат на екрана да се извеждат низовете
	 * само с главни и само с малки букви. Пример: Abcd Efgh 
	 * Изход: ABCD abcd
	 *        EFGH efgh
	 */

	public static void bigAndSmallLetters(String letters) {

		System.out.println(letters.toUpperCase());
		System.out.println(letters.toLowerCase());

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String lettersOne = "";
		String lettersTwo = "";
		do {
			System.out.print("Enter first string < 40 letters: ");
			lettersOne = input.nextLine();
		} while (lettersOne.length() > 40);

		do {
			System.out.print("Enter second string < 40 letters: ");
			lettersTwo = input.nextLine();
		} while (lettersTwo.length() > 40);

		bigAndSmallLetters(lettersOne);
		System.out.println();
		bigAndSmallLetters(lettersTwo);

	}

}
