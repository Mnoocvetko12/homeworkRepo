package exerciseFive;

import java.util.Scanner;

public class HorseMove {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix row/col: ");
		int row = input.nextInt();
		int col = input.nextInt();

		char[][] matrix = new char[row][col];

		initMatrix(matrix);

		System.out.print("Enter horse start position row/col: ");
		row = input.nextInt();
		col = input.nextInt();

		horseMove(matrix, row, col);

	}

	public static void initMatrix(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = '.';
			}
		}
	}

	public static void printMatrix(char[][] matrix) {
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				System.out.print(matrix[rows][cols] + " ");
			}
			System.out.println();
		}
	}

	public static boolean checkForFull(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != '*') {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean validMove(char[][] matrix, int row, int col) {
		if(row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[row].length - 1) {
			return false;
		}
		return true;
	}
	
	

	public static void horseMove(char[][] matrix, int row, int col) {
		printMatrix(matrix);
		System.out.println();

		if (row > matrix.length - 1 || row < 0 || col > matrix[row].length - 1 || col < 0) {

			return;
		}

		if (matrix[row][col] != '.') {
			return;
		}

		matrix[row][col] = '*';

		horseMove(matrix, row + 2, col - 1);
		horseMove(matrix, row + 2, col + 1);
		horseMove(matrix, row - 2, col - 1);
		horseMove(matrix, row - 2, col + 1);
		horseMove(matrix, row - 1, col + 2);
		horseMove(matrix, row - 1, col - 2);
		horseMove(matrix, row + 1, col - 2);
		horseMove(matrix, row + 1, col + 2);
		
	}

}
