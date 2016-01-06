import java.util.Arrays;

public class ExerciseFour {
	
	/*
	 * Имате предварително въведени стойности на елементи в двумерен
     * масив - естествени числа.
     * Да се състави програма, чрез която се извеждат стойностите на
     * елементите в двумерен масив след обръщането му на +90 градуса.
	 */

	public static void main(String[] args) {
		
		int[][] array = {{1, 2, 3, 4},
				         {5, 6, 7, 8},
				         {9, 10, 11, 12},
				         {13, 14, 15, 16}};
		
		
		int[][] newArray = new int[array.length][array.length];
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				newArray[row][col] = array[array[row].length - col - 1][row];
			}

		}

		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
