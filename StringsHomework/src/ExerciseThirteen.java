
public class ExerciseThirteen {

	/*
	 * 
	 * Да се създаде метод, който приема два масива от числа и връща масив,
	 * съдържащ всички елементи на подадените масиви, като в първата част на
	 * масива са елементите на първия подаден масив, а във втората част – тези
	 * на втория подаден масив.
	 */

	public static void main(String[] args) {

		int[] arrayOne = { 1, 2, 3, 4, 5, 6 };
		int[] arrayTwo = { 18, 19, 20, 21, 22, 23, 24, 25, 26 };

		int[] newArray = newArray(arrayOne, arrayTwo);
		printArray(newArray);

		

	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static int[] newArray(int[] arrayOne, int[] arrayTwo) {
		int[] newArray = new int[arrayOne.length + arrayTwo.length];

		int count = 0;
		int countTwo = 0;
		while (count < newArray.length) {
			if (count < arrayOne.length) {
				newArray[count] = arrayOne[count];
				
			} else {

				newArray[count] = arrayTwo[countTwo++];

			}
			count++;
		}

		return newArray;

	}

}
