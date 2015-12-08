package recursion;

import java.util.Scanner;

public class ExerciseFour {

	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] loops;

	/*
	 * 4. Да се състави програма, която приема за входни данни масив от
	 * естествени числа. Програмата да извежда дали в масива има числа, които се
	 * повтарят. Използвайте рекурсия.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		numberOfLoops = input.nextInt();
		System.out.print("K = ");
		numberOfIterations = input.nextInt();
		input.close();
		loops = new int[numberOfLoops];
		nestedLoops(0);

		int[] array = { 1, 2, 3, 4, 2, 2, 7, 8, 9, 10 };

	}

	public static void nestedLoops(int currentLoop) {
		if (currentLoop == numberOfLoops) {
//			printLoops();
			return;
		}

		for (int counter = 1; counter <= numberOfIterations; counter++) {
			loops[currentLoop] = counter;
			nestedLoops(currentLoop + 1);
		}

	}

	public static void printLoops() {
		for (int i = 0; i < numberOfLoops; i++) {
			System.out.printf("%d ", loops[i]);
		}
		System.out.println();
	}
}
