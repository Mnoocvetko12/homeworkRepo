import java.util.Scanner;

public class ExerciseEight {

	/*
	 * Напишете програма, която намира и извежда най-дългата редица от еднакви
	 * поредни елементи в даден масив.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array lenght: ");
		int one = input.nextInt();

		int[] array = new int[one];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}

		int count = 1;
		int temp = 0;
		int element = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
				if (temp < count) {
					temp = count;

					element = array[i];

				}

			} else {
				count = 1;
			}
		}

		for (int i = 0; i < temp; i++) {
			System.out.print(element + " ");
		}

	}

}
