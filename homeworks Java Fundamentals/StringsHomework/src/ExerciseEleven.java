
public class ExerciseEleven {

	/*
	 * Да се създаде метод, който отпечатва масив в конзолата.
	 */

	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] charArray = { '0', '1', '2','3','4','5','6','7','8', '9'};
		String[] strArray = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		
		int[][] matrix = {{1, 2, 3, 4},
						  {5, 6, 7, 8},
						  {9, 10, 11, 12},
						  {13, 14, 15, 16}};
		
		printArray(intArray);
		printArray(strArray);
		printArray(matrix);
	}
	
	public static void printArray(byte[] array) {
		for (byte i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(short[] array) {
		for (short i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(long[] array) {
		for (long i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(float[] array) {
		for (float i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(double[] array) {
		for (double i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(char[] array) {
		for (char i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(boolean[] array) {
		for (boolean i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(String[] array) {
		for (String i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void printArray(byte[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(short[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(long[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(float[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(double[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(char[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(boolean[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(String[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

}
