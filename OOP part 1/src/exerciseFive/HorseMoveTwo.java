package exerciseFive;

import java.util.Scanner;

public class HorseMoveTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix row and col: ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		char[][] matrix = new char[rows][cols];
		
		System.out.print("Enter start position of horse (row/col): ");
		rows = input.nextInt();
		cols = input.nextInt();
		
		matrix[rows][cols] = 's';
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(char[][] matrix) {
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				System.out.print(matrix[rows][cols] + " ");
			}
			System.out.println();
		}
	}
	

 
}
