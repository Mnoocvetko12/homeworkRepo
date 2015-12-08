package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseSix {

	/*
	 * Да се сортира даден двумерен масив като се използва алгоритъма за
	 * сортиране по метода на мехурчето. Програмата първо прочита масива, а след
	 * това го извежда подреден.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array row col: ");
		int[][] array = new int[input.nextInt()][input.nextInt()];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print("Enter element: ");
				array[row][col] = input.nextInt();
			}
		}
		
		bubbleSort(array);
		System.out.println(Arrays.deepToString(array));
		
	}
	
	public static void bubbleSort(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int row = 0; row < array.length; row++) {
					for (int col = 0; col < array[row].length; col++) {
						if (array[i][j] < array[row][col] && array[i][j] != array[row][col]) {
							int temp = array[row][col];
							array[row][col] = array[i][j];
							array[i][j] = temp;
						}
					}
				
			}
				
				
			}
		}
	}

}
