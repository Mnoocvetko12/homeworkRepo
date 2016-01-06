package exerciseFive;

import java.util.Scanner;

public class KnightMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix row/col: ");
		int row = input.nextInt();
		int col = input.nextInt();
		
		char[][] matrix = new char[row][col];
		KnightMoves.fillMatrix(matrix);
		KnightMoves.printMatrix(matrix);
		System.out.println();
		
		System.out.print("Enter start position row/col: ");
		row = input.nextInt();
		col = input.nextInt();
		
		KnightMoves.knight(matrix, row, col);
		
		KnightMoves.printMatrix(matrix);

	}

}
