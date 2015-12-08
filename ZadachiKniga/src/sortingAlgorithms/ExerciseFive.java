package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class ExerciseFive {

	/*
	 * Напишете програма, която по дадена последователност от нули и единици ги
	 * изкарва сортирани. Да се реализира по възможно най- оптималния начин.
	 */

	public static void main(String[] args) {
	
		Random rdm = new Random();
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rdm.nextInt(2);
		}
		
		System.out.println(Arrays.toString(array));
		countingSort(array);

	}
	
	public static void countingSort(int[] array) {
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		
		int[] countArray = new int[max+1];
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]]++;
		}
		int index = 0;
		
		for (int i = 0; i < countArray.length; i++) {
			int temp = countArray[i];
			while(temp > 0) {
				System.out.print(i + " ");
				index++;
				temp--;
			}
		}
		
		System.out.println(Arrays.toString(countArray));
	}

}
