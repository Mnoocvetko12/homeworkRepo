package binaryExercises;

import java.util.Scanner;

public class ExerciseTwo {

	/*
	 * Да се състави програма, която въвежда число от 0 до 50 и го извежда в
	 * двоичен вид. Да не се използва операцията Integer.toBinaryString().
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number from 0 to 50: ");
		int n = input.nextInt();

		System.out.println(toBinary(n));

	}

	public static int toBinary(int n) {

		int temp = 0;
		int tempNum = 0;
		int binaryNum = 0;

		while (n != 0) {
			temp = n % 2;
			tempNum += temp;
			tempNum *= 10;
			n = n / 2;

		}
		while (tempNum != 0) {
			
			
			
			temp = tempNum % 10;
			binaryNum += temp;
			if (tempNum == 0) {
				break;
			}
			binaryNum *= 10;

			tempNum /= 10;

		}

		return binaryNum;

	}

}
