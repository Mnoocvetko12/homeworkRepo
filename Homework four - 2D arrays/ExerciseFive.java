
public class ExerciseFive {

	/*
	 * Да се състави програма, при която предварително са въведени естествени
	 * числа в двумерен масив 4*4 елемента. Програмата да извежда резултат от
	 * проверката какво е съотношението на най-голямата сума по редове спрямо
	 * най-голямата сума по колони.
	 */

	public static void main(String[] args) {

		int[][] array = { { 1, 20, 3, 4 }, 
				          { 5, 16, 7, 8 }, 
				          { 9, 10, 11, 12 }, 
				          { 13, 14, 15, 18 }};

		int tempSumRow = 0;
		int sumRow = 0;
		int tempSumCol = 0;
		int sumCol = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
					tempSumRow = tempSumRow + array[row][col];
					tempSumCol = tempSumCol + array[col][row];

			}
			if (sumRow < tempSumRow) {
				sumRow = tempSumRow;

			}
			if (sumCol < tempSumCol) {
				sumCol = tempSumCol;

			}
			tempSumRow = 0;
			tempSumCol = 0;

		}

		if (sumRow > sumCol) {
			System.out.println("Max sum of row is bigger!");
		} else {
			if(sumRow < sumCol) {
			System.out.println("Max sum of col is bigger!");
			}
			else {
				System.out.println("Sum row and sum col are equals!");
			}
		}

		System.out.println("Max sum of row = " + sumRow);
		System.out.println("Max sum of col = " + sumCol);
	}

}
