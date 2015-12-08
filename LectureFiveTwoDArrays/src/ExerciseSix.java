
public class ExerciseSix {
	
	/*
	 *  Имате предварително въведени стойности от естествени числа.
     *  Числата са въведени в квадратна таблица с размери 6 реда и 6 колони.
     *  Да се състави програма, чрез която се намира сумата на всички
     *  елементи от редовете с четни номера: 2,4 и 6.
     *  Програмата да извежда и сумата на всеки отделен ред.
	 */

	public static void main(String[] args) {
		
		int[][] array = {{11,12,13,14,15,16},
						 {21,22,23,24,25,26},
						 {31,32,33,34,35,36},
						 {41,42,43,44,45,46},
						 {51,52,53,54,55,56},
						 {61,62,63,64,65,66}};
		
		int sum = 0;
		int tempSum = 0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if(row % 2 != 0) {
					tempSum = tempSum + array[row][col];
					System.out.print(array[row][col] + " ");
				}
				
			}
			if(row % 2 != 0) {
			System.out.println("sum = " + tempSum);
			sum += tempSum;
			tempSum = 0;
			}
		}

		System.out.println("Sum of elements is: " + sum);
	}

}
