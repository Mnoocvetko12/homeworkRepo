import java.util.Scanner;

public class ExerciseTwo {

	/*
	 * Въведете 2 различни целочислени числа от конзолата. Запишете
	 * тяхната сума, разлика, произведение, остатък от деление и
	 * целочислено деление в отделни променливи и разпечатайте тези
	 * резултати в конзолата. Опитайте същото с числа с плаваща запетая.
	 */
	
	  
	  
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int numOne = input.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = input.nextInt();
		
		while (numTwo == 0) {
			System.out.println("Can't divided by zero!!!");
			System.out.print("Enter second number: ");
			numTwo = input.nextInt();	
		}
		
		int sum = numOne + numTwo;
		int diff = numOne - numTwo;
		int product = numOne * numTwo;
		int divWithRemainder = numOne % numTwo;
		int division = numOne / numTwo;
		
		System.out.println();
		System.out.println("Sum: " + sum + "\ndifference: " + diff + "\nproduct: " + product + 
				"\nDivision with remainder: " + divWithRemainder + "\ndivision: " + division );
		
//		System.out.print("Enter first number: ");
//		double doubleOne = input.nextDouble();
//		System.out.print("Enter second number: ");
//		double doubleTwo = input.nextDouble();
//		
//		while (doubleTwo == 0) {
//			System.out.println("Can't divided by zero!!!");
//			System.out.print("Enter second number: ");
//			doubleTwo = input.nextDouble();	
//		}
//		
//		double sumD = doubleOne + doubleTwo;
//		double diffD = doubleOne - doubleTwo;
//		double productD = doubleOne * doubleTwo;
//		double divWithRemainderD = doubleOne % doubleTwo;
//		double divisionD = doubleOne / doubleTwo;
//		
//		System.out.println();
//		System.out.println("Sum: " + sum + "\ndifference: " + diff + "\nproduct: " + product + 
//				"\nDivision with remainder: " + divWithRemainder + "\ndivision: " + division );

	}

}
