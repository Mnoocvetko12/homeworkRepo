package sortingAlgorithms;

public class ExerciseTwo {

	/*
	 * Да се имплементира двоично търсене в двумерен масив. Първо въвеждаме
	 * размерите и елементите на двумерния масив, след което прочитаме
	 * стойността, която търсим. Да се изведе реда и колоната на елемента ако
	 * той е намерен или че не намерен в противен случай.
	 */

	public static void main(String[] args) {
		int[][] array = {{3, 2, 5},
				         {1, 8, 4}};
	}
	
	public static void binarySearch(int num, int[] array, int row, int col) {
		int left = 0;
		int right = array.length;
		int rowCount = 0;
		
		while(rowCount < row) {
			while (left <= right) {
				int mid = (left + right) / 2;
				
				if(array[mid] == num) {
					System.out.println("The number " + num + " is founded in row " + rowCount + " and col " + mid );
					break;
				}
				
				if(array[mid] < num) {
					
				}
			}
		}
	}

}
