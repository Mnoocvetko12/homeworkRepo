package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {

	/*
	 * 3. Като се използва операцията за разделяне в бързото сортиране, да се
	 * реализира намирането на К-тия най-голям елемент в масив. Т.е. ако е К=1,
	 * извеждаме най-големия, ако К=2 – втория най-голям и т.н. Програмата
	 * въвежда масив и числото К, след което извежда търсения елемент.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of largest element: ");
		int power = input.nextInt();
		
		System.out.print("Enter array length: ");
		int[] array = makeArray(input.nextInt());
		
		quickSort(array, 0, array.length -1);
		System.out.println(Arrays.toString(array));
		System.out.println("The " + power + " largest element is " + array[array.length - power]);

	}
	
	public static int[] makeArray(int length) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[length];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter array element: ");
			array[i] = input.nextInt();

		}
		return array;
		
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int k = left -1;
		
		for (int i = left; i <= right; i++) {
			if(pivot >= array[i]) {
				k++;
				swap(array, k, i);
			}
		}
		return k;
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int k = partition(array, left, right);
		
		quickSort(array, left, k -1);
		quickSort(array, k +1, right);
	}

}
