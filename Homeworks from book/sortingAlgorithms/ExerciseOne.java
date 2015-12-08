package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerciseOne {

	/*
	 * 1. Да се състави програма, която се опитва на всяка стъпка да познае
	 * намислено от потребителя число в интервала от 0 до 100. На всяка стъпка
	 * програмата извежда предположение за намисленото от потребителя число и
	 * като отговор прочита цяло число – 0, 1 или 2. Като съответно 0 означава –
	 * надолу, 2 – нагоре, а 1 – числото е познато. Програмата трябва познае
	 * числото за не повече от 8 питания, след което да приключи работа.
	 */

	public static void main(String[] args) {
		int lenght = 100;
		int[] array = new int[lenght];
		
		array = makeArray(array, lenght);
		System.out.println(Arrays.toString(array));
		binarySearch(array);

	}
	
	public static int[] makeArray(int[] array, int lenght) {
		Random rdm = new Random();
		int count = 1;
		
		for (int i = 0; i < lenght; i++) {
			array[i] = count++;
		}
		return array;
	}
	
	public static void binarySearch(int[] array) {
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		int left = 0;
		int right = array.length-1;
		
		do {
			int mid = (left + right) / 2;
			System.out.println("Is that your number? " + mid);
			System.out.print("For yes press 1, for < press 0, for > press 2 and enter: ");
			int num = input.nextInt();
			if(num == 1) {
				System.out.println("This is your number " + num);
				System.out.println("Attempts: " + attempts);
				break;
			}
			if(num == 0) {
				right = mid - 1;
				attempts++;
			}
			if(num == 2) {
				left = mid + 1;
				attempts++;
			}
			
		} while (left <= right);
		

	}

}
