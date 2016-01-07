import java.util.Scanner;

public class ExersiceFive {
	
	/*
	 * Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int numOne = input.nextInt();
		System.out.print("Enter second number: ");
		int numTwo = input.nextInt();
		System.out.print("Enter third number: ");
		int numThree = input.nextInt();
		
		if((numOne >= numTwo) && (numTwo >= numThree)) {
			System.out.println(numOne + "\n" + numTwo + "\n" + numThree);
		}
		else if((numOne >= numTwo) && (numTwo <= numThree) && (numOne >= numThree)) {
			System.out.println(numOne + "\n" + numThree + "\n" + numTwo);
		}
		else if((numTwo >= numOne) && (numOne >= numThree)) {
			System.out.println(numTwo + "\n" + numOne + "\n" + numThree);
		}
		else if((numTwo >= numOne) && (numOne <= numThree) && (numTwo >= numThree)) {
			System.out.println(numTwo + "\n" + numThree + "\n" + numOne);
		}
		else if((numThree >= numOne) && (numOne >= numTwo)) {
			System.out.println(numThree + "\n" + numOne + "\n" + numTwo);
		}
		else if((numThree >= numOne) && (numOne <= numTwo) && (numThree >= numTwo)) {
			System.out.println(numThree + "\n" + numTwo + "\n" + numOne);
		}

	}

}
