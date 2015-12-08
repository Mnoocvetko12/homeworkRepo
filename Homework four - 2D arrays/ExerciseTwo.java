
public class ExerciseTwo {
	
	/*
	 * Имате квадратен двумерен масив от естествени числа, чийто стойности
     * се въвеждат. Да се отпечатат диагоналите на масива.
	 */

	public static void main(String[] args) {
		
		int[][] array = {{1,4,6,3},
				         {5,9,7,2},
				         {4,8,1,9},
				         {2,3,4,5}};
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if(row == col) {
					System.out.print(array[row][col] + " ");
				}
				
			}
			
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i + j == array.length - 1) {
					System.out.print(array[i][j] + " ");
				}
			}
		}

	}

}
