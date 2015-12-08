import java.util.Scanner;

public class ExerciseNine {
	
	/*
	 *  Да се състави програма, която чете от конзолата 2 естествени
     *  двуцифрени числа a,b.
     *  Програмата да изведе в конзолата дали последната цифра от
     *  произведението на двете числа е четна, както и самата цифра.
     *  Входни данни: a,b - естествени числа от интервала [10..99].
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number one between 10 and 99: ");
		int numOne = input.nextInt();
		System.out.print("Enter number two between 10 and 99: ");
		int numTwo = input.nextInt();
		
		while (numOne < 10 || numOne > 99) {
			System.out.println("Wrong number try again!!!");
			System.out.print("Enter number one between 10 and 99: ");
			numOne = input.nextInt();
				
		}
		while (numTwo < 10 || numTwo > 99) {
			System.out.println("Wrong number try again!!!");
			System.out.print("Enter number two between 10 and 99: ");
			numTwo = input.nextInt();
		}
			
			
	

		int product = numOne * numTwo;
		int temp = product % 10;
		
		if(temp % 2 == 0) {
			System.out.printf("The number is: %d, last digit is: %d even", product, temp);
		}
		else {
			System.out.printf("The number is: %d, last digit is: %d odd", product, temp);
		}

	}

}
