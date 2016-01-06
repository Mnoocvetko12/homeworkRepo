package exerciseFive;

public class KnightMoves {

	public static void printMatrix(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static boolean validMoves(char[][] matrix, int row, int col) {
		if ((row < 0 || row > matrix.length - 1) || (col < 0 || col > matrix[row].length - 1)) {
			return false;
		}
		return true;
	}

	public static void fillMatrix(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = '.';
			}
		}
	}

	public static void knight(char[][] matrix, int row, int col) {
		boolean flag = true;
		while (flag) {
			if(validMoves(matrix, row, col)) {
			matrix[row][col] = '*';
			flag = false;
			}
			
			while (true) {

				if (validMoves(matrix, row, col)) {
					printMatrix(matrix);
					System.out.println();
					row += 2;
					col += 1;
					flag = true;
					break;
				} 

			}

		}
	}
}
