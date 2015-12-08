package stringsExercises;

import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lenght = 0;

		do {
			System.out.println("Enter first array lenght: ");
			lenght = input.nextInt();
		} while (lenght < 0 || lenght > 40);

		char[] arrayOne = new char[lenght];

		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print("Enter array one elements: ");
			arrayOne[i] = input.next().charAt(0);
		}

		int lenght2 = 0;

		do {
			System.out.println("Enter second array lenght: ");
			lenght = input.nextInt();
		} while (lenght < 0 || lenght > 40);

		char[] arrayTwo = new char[lenght];

		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print("Enter array two elements: ");
			arrayTwo[i] = input.next().charAt(0);
		}
		
		
		String one = "";
		String two = "";
		
		for (int i = 0; i < arrayOne.length; i++) {
			one += arrayOne[i];
		}
		one = one.toUpperCase();
		System.out.print(one + " ");
		one = one.toLowerCase();
		System.out.println(one);
		
		for (int i = 0; i < arrayTwo.length; i++) {
			two += arrayTwo[i];
		}
		two = two.toUpperCase();
		System.out.print(two + " ");
		two = two.toLowerCase();
		System.out.println(two);

	}
	
	

}
