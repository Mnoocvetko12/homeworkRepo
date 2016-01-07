import java.util.Scanner;

public class ExerciseTwelve {

	/*
	 * Да се създаде метод, който приема за входни данни число N и връща масив
	 * от числа с дължина N, който съдържа всички числа от 1 до N.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int n = input.nextInt();
		
		int[] array = createArray(n);
		printArray(array);

	}
	
	public static int[] createArray(int n) {
		int[] array = new int[n];
		int temp = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = temp++;
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
