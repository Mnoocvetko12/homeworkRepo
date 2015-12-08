
public class ExerciseOne {
	
	/*
	 *  Имате двумерен масив 6х5 от естествени числа, чийто стойности са
     *  въведени предварително.
     *  Да се състави програма, чрез която се извеждат елементите от масива
     *  с най-малката и най-голямата стойност.
	 */

	public static void main(String[] args) {
		
		int[][] array = {{48,72,13,14,15},
				         {21,22,53,24,75},
				         {31,57,33,34,35},
				         {41,95,43,44,45},
				         {59,52,53,54,55},
				         {61,69,63,64,65}};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if(max < array[row][col]) {
					max = array[row][col];
				}
				if(min > array[row][col]) {
					min = array[row][col];
				}
			}
		}
		
		System.out.println("Min value in array is: " + min);
		System.out.println("Max value in array is: " + max);
		

	}

}
