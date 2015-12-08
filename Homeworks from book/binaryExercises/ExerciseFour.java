package binaryExercises;

import java.util.Scanner;

public class ExerciseFour {

	/*
	 * Да се състави програма, която въвежда 5 цели числа от конзолата. Дадено е
	 * че две двойки от тях са равни, а едно число е различно от останалите. Да
	 * се изведе стойността на това число. Да се използват побитови операции.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		
		for (int i = 0; i < 11; i++) {
			System.out.print("Enter enter number: ");
			num = num ^ input.nextInt();
			System.out.println(num);
		}
		
		
		
		


	}

}
