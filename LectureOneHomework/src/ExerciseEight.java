import java.util.Scanner;

public class ExerciseEight {
	
	/*
	 *  Да се състави програма, която чете от конзолата 4-цифренo
     *  естествено число от интервала [1000.. 9999]. От това число се
     *  формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
     *  и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
     *  3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
     *  ново число e по-малко <, равно = или по-голямо от 2-то число.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 1000 and 9999: ");
		int number = input.nextInt();
		
		while (number < 1000 || number > 9999) {
			System.out.println("Wrong number try again!!!");
			System.out.print("Enter number between 1000 and 9999: ");
			number = input.nextInt();
		}
		
		
		int firstDigit = number / 1000;
		int secondDigit = (number / 100) % 10;
		int thirdDigit = (number / 10) % 10;
		int fourDigit = number % 10;
		
		
		String numOne = firstDigit + "" + fourDigit;
		String numTwo = secondDigit + "" + thirdDigit;
		
		int firstNum = Integer.parseInt(numOne);
		int secondNum = Integer.parseInt(numTwo);
		
		if(firstNum > secondNum) {
			System.out.printf("%d > %d", firstNum, secondNum);
		}
		else if(firstNum == secondNum) {
			System.out.printf("%d = %d", firstNum, secondNum);
		}
		else if(firstNum < secondNum) {
			System.out.printf("%d < %d", firstNum, secondNum);
		}

	}

}
