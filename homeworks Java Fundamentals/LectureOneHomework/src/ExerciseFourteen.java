import java.util.Scanner;

public class ExerciseFourteen {
	
	/*
	 *  Да се състави програма, която по въведени координати на 2 позиции
     *  от шахматната дъска извежда отговор дали са оцветени в еднакъв или
     *  различен цвят.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number  for xOne between 1 and 8: ");
		int xOne = input.nextInt();
		while (xOne < 1 || xOne > 8) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number  for xOne between 1 and 8: ");
			xOne = input.nextInt();
		}

		System.out.print("Enter number for yOne between 1 and 8: ");
		int yOne = input.nextInt();
		while (yOne < 1 || yOne > 8) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number  for yOne between 1 and 8: ");
			yOne = input.nextInt();
		}

		System.out.print("Enter number for xTwo between 1 and 8: ");
		int xTwo = input.nextInt();
		while (xTwo < 1 || xTwo > 8) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number  for xTwo between 1 and 8: ");
			xTwo = input.nextInt();
		}

		System.out.print("Enter number for yTwo between 1 and 8: ");
		int yTwo = input.nextInt();
		while (yTwo < 1 || yTwo > 8) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number  for yTwo between 1 and 8: ");
			yTwo = input.nextInt();
		}
		
		boolean white1 = (xOne % 2 == 0 && yOne % 2 == 0) && (xTwo % 2 == 0 && yTwo % 2 == 0);
		boolean white2 = (xOne % 2 != 0 && yOne % 2 != 0) && (xTwo % 2 != 0 && yTwo % 2 != 0);
		boolean white3 = (xOne % 2 == 0 && yOne % 2 == 0) && (xTwo % 2 != 0 && yTwo % 2 != 0);
		boolean white4 = (xOne % 2 != 0 && yOne % 2 != 0) && (xTwo % 2 == 0 && yTwo % 2 == 0);
		
		boolean black1 = (xOne % 2 != 0 && yOne % 2 == 0) && (xTwo % 2 != 0 && yTwo % 2 == 0);
		boolean black2 = (xOne % 2 == 0 && yOne % 2 != 0) && (xTwo % 2 == 0 && yTwo % 2 != 0);
		boolean black3 = (xOne % 2 != 0 && yOne % 2 == 0) && (xTwo % 2 == 0 && yTwo % 2 != 0);
		boolean black4 = (xOne % 2 == 0 && yOne % 2 != 0) && (xTwo % 2 != 0 && yTwo % 2 == 0);
		
		if((white1 || white2 || white3 || white4) ||
		   (black1 || black2 || black3 || black4)) {
			System.out.println("The positions are the same color!");
		}
		else {
			System.out.println("The positions are of a different color!");
		}

	}

}
