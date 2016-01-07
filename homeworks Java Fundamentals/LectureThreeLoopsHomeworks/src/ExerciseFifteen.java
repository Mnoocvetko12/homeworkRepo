import java.util.Scanner;

public class ExerciseFifteen {

	/*
	 * Да се състави програма, която да изчисли сумата на всички числа от 1 до
	 * въведено число N.
	 * Използвайте цикъл do-while.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter positive number: ");
		int num = input.nextInt();

		while (num < 1) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter positive number: ");
			num = input.nextInt();
		}

		int sum2 = 0;
		int count = 1;

		do {
			sum2 += count;

			count++;
		} while (num >= count);
		System.out.println("Sum is: " + sum2);

		// int sum = 0;

		// for (int i = 1; i <= num; i++) {
		// sum += i;
		//
		// }
		// System.out.println("Sum is: " + sum);

	}

}
