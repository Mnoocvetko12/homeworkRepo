package stringsExercises;

import java.util.Scanner;

public class ExerciseSeven {

	/*
	 * 7. Да се състави програма, която да извежда ромб от символи. Границите на
	 * ромба да са числа, а вътрешността да е запълнена със символ *. Програмата
	 * да приема за входни данни естествено число, което да определя дължината
	 * на страна на ромба.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num *2; j++) {
				if(num - i <= j && num + i >= j) {
					System.out.print(i);
				}
				else {
					if(num - i >= j && num + i <= j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
//		System.out.println();

	}

}
