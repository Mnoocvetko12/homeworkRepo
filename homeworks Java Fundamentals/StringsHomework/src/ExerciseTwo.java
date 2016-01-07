import java.util.Scanner;

public class ExerciseTwo {

	/*
	 * Да се състави програма, чрез която от клавиатурата се въвеждат
	 * последователно две думи с дължина 10-20 знака. Програмата да размени
	 * първите им 5 знака и да изведе дължината на по-дългата, както и новото им
	 * съдържание. Пример: uchilishe uchenik Изход: 9 uchenishe
	 */

	public static void replaceLetters(String textOne, String textTwo, int start, int end) {
		boolean validIndex = indexValidation(textOne, textTwo, start, end);

		if (validIndex) {
			String partOne = textOne.substring(start, end);
			String partTwo = textTwo.substring(start, end);

			textOne = textOne.replace(partOne, partTwo);
			textTwo = textTwo.replace(partTwo, partOne);

			longestWord(textOne, textTwo);
		} else {
			return;
		}

	}

	public static void longestWord(String textOne, String textTwo) {
		if (textOne.length() == textTwo.length()) {

			System.out.println(textOne.length() + " letters " + textOne);
			System.out.println("Other word " + textTwo);
		} else {
			if (textOne.length() > textTwo.length()) {
				System.out.println(textOne.length() + " letters " + textOne);
				System.out.println("Other word " + textTwo);

			} else {
				System.out.println(textTwo.length() + " letters " + textTwo);
				System.out.println("Other word " + textOne);
			}
		}
	}

	public static boolean indexValidation(String textOne, String textTwo, int start, int end) {
		boolean flag = true;
		if ((start < 0 || start > textOne.length()) || (end < 0 || end > textOne.length())) {
			System.out.println("Invalid index input for first word!!");
			flag = false;
		} else {
			if ((start < 0 || start > textTwo.length()) || (end < 0 || end > textTwo.length())) {
				System.out.println("Invalid index input for second word!!");
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String textOne = "";
		String textTwo = "";

		do {
			System.out.print("Enter first word < 20 letters: ");
			textOne = input.nextLine();
		} while (textOne.length() > 20);

		do {
			System.out.print("Enter second word < 20 letters: ");
			textTwo = input.nextLine();
		} while (textTwo.length() > 20);

		replaceLetters(textOne, textTwo, 0, 5);

	}

}
