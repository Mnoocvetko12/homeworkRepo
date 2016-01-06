import java.util.Arrays;
import java.util.Scanner;

public class ExerciseFifteen {

	/*
	 * Да се състави програма, която въвежда в едномерен масив реални числа.
	 * Като изход: програма извежда онези 3 различни числа, чиято абсолютна
	 * стойност формира максималната обща сума.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array length: ");
		int num = input.nextInt();
		while (num < 1) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter array length: ");
			num = input.nextInt();

		}

		double[] array = new double[num];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter array values: ");
			array[i] = input.nextDouble();

		}

		double temp = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (array[i] < 0) ? (array[i] * -1) : array[i];
			for (int j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				}
			}
		}
		double[] newArray = new double[3];
		int newArrayIndex = 0;
		int arrayIndex = array.length - 1;

		while (newArrayIndex < 3) {
			if (array[arrayIndex] != array[arrayIndex - 1]) {
				newArray[newArrayIndex] = array[arrayIndex];
				newArrayIndex++;
			}
			arrayIndex--;

		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + " ");
		}
	}
}
