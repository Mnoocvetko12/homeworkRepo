package sortingAlgorithms;

import java.util.Scanner;

public class ExerciseEight {

	/*
	 * 8. Да се състави програма, която проверява дали: предварително въведен
	 * масив от естествени числа от интервала [0..5000] е сортиран във възходящ
	 * ред. Програмата да извежда и съобщениe кои елементи не са в правилна
	 * подредба.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int[] array = new int[input.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter array elements: ");
			array[i] = input.nextInt();
		}
		
		
		checkArray(array);
	}
	
	public static void checkArray(int[] array) {
		
		boolean flag = true;
		
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i + 1]) {
				flag = false;
				int temp1 = array[i];
				int temp2 = array[i+1];
				System.out.println("Element " + temp1 + " is > from element " + temp2 );
			}
		}
		
		if (flag) {
			System.out.println("Array is sorted!");
		}
		else {
			System.out.println("Array is doesn't sort!");
		}
	}

}
