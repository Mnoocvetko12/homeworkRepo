import java.util.Scanner;

public class ExersiceThree {
	
	/*
	 * Въведете 2 различни числа от конзолата и разменете стойността им.
     * Разпечатайте новите стойности
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double firstNum = input.nextDouble();
		System.out.print("Enter second number: ");
		double secondNum = input.nextDouble();
		
		double temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.println("First num is: " + firstNum);
		System.out.println("Second num is: " + secondNum);

	}

}
