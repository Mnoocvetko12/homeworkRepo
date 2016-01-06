import java.util.Scanner;

public class ExerciseSix {
	
	/*
	 * Да се прочете число от екрана(конзолата) и да се
     * изведе сбора на всички числа между 1 и въведеното число.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		while (num < 1) {
			System.out.println("Invalid input try again!!!");
			System.out.print("Enter number > 1: ");
			num = input.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
