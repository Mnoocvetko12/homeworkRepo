import java.util.Scanner;

public class ExerciseEleven {

	/*
	 * Съставете програма, която по дадено трицифренo число проверява дали
	 * числото се дели на всяка своя цифра. Във въведеното число да няма цифра
	 * 0.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three digits number without 0 digit: ");
		int number = input.nextInt();

		while (number < 111 || number > 999) {
			
			System.out.println("Wrong number!!!");
			System.out.print("Enter three digits number without 0 digit: ");
			number = input.nextInt();
		}

		int numOne = number / 100;
		int numTwo = (number / 10) % 10;
		int numThree = number % 10;

		if (numOne == 0 || numTwo == 0 || numThree == 0) {
			System.out.println("Number without zero!!!");

		} else {

			if ((number % numOne != 0) || (number % numTwo != 0) || (number % numThree != 0)) {
				System.out.println("Not divisible by his digits");
			} else {
				System.out.println("Divided on his digits");
			}
		}
	}

}
