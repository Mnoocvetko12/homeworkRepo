import java.util.Scanner;

public class ExerciseOne {
	
	/*
	 * Да се прочете масив и да се намери най-малкото число кратно на 3 от масива.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number for array lenght: ");
		int num = input.nextInt();
		
		int[] array = new int[num];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter number: ");
			array[i] = input.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			if((array[i] % 3 == 0) && array[i] <= min) {
				min = array[i];
			}
		}
		
		System.out.println("Min value is: " + min);

	}

}
