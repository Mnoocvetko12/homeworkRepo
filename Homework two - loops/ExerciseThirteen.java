import java.util.Scanner;

public class ExerciseThirteen {
	
	/*
	 *  Да се състави програма, която извежда всички
     *  естествени трицифрени числа, които имат сбор на цифрите равен
     *  на дадено число.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 1 and 27: ");
		int sum = input.nextInt();
		
		while (sum < 1 || sum > 27) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 1 and 27: ");
			sum = input.nextInt();
			
		}
		
//		for (int i = 100; i < 1000; i++) {
//			int digitOne = i / 100;
//			int digitTwo = (i / 10) % 10;
//			int digitThree = i % 10;
//			
//			int temp = digitOne + digitTwo + digitThree;
//			
//			if(temp == sum) {
//				System.out.println(i);
//			}
//
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					if(i + j + k == sum) {
						System.out.println(i + "" + j + "" + k);
					}
				}
				
			}
			
		}
	}

}
