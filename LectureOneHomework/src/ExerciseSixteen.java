import java.util.Scanner;

public class ExerciseSixteen {
	
	/*
	 *  Въведено е трицифрено естествено число от вида abc.
     *  Трябва да се провери дали:
     *  ако a = b = c - Изход: цифрите са равни;
     *  ако a>b>c - Изход: цифрите са във възходящ ред;
     *  ако a<b<c цифрите са в низходящ ред;
     *  и изход: цифрите са ненаредени, за неописаните случаи.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three digits integer between 100 and 999: ");
		int number = input.nextInt();
		
		while (number < 100 || number > 999) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter three digits integer between 100 and 999: ");
			number = input.nextInt();
		}
		
		int digitOne = number / 100;
		int digitTwo = (number / 10) % 10;
		int digitThree = number % 10;
		
		if(digitOne == digitTwo && digitTwo == digitThree) {
			System.out.println("The digits are equals.");
		}
		else if(digitOne < digitTwo && digitTwo < digitThree) {
			System.out.println("The digits are in ascending order.");
		}
		else if(digitOne > digitTwo && digitTwo > digitThree) {
			System.out.println("The digits are in descending order.");
		}
		else {
			System.out.println("The digits are out of order.");
		}

	}

}
