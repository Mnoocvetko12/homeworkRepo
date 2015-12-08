package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class ExersiceSeven {

	/*
	 * Да се състави програма, която намира най-често срещания елемент в масив.
	 * Да се използва част от сортирането чрез броене.
	 */

	public static void main(String[] args) {
		
		Random rdm = new Random();
		
		int[] array = new int[50];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rdm.nextInt(20);
		}
		
		System.out.println(Arrays.toString(array));
		
		countingElements(array);
	}
	
	public static void countingElements(int[] array) {
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
		max = 0;
		int num = 0;
		int i = 0;
		for (i = 0; i < countArray.length; i++) {
			if(max < countArray[i]) {
				max = countArray[i];
				num = i;
				
			}
		}
		
		System.out.println("The num " + num + " has " + max + " times in array!");
		
	}

}
