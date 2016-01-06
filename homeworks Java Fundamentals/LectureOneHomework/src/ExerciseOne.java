import java.util.Scanner;

public class ExerciseOne {

	/*
	 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	 * клавиатурата A и B (може да са с плаваща запетая – double).
     * После да се прочете 3-то число C и да се провери дали то е м/у A и B.
     * Да се изведе подходящо съобщение за това дали C е между A и B.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A number: ");
		double a = input.nextDouble();
		System.out.print("Enter B number: ");
		double b = input.nextDouble();
		System.out.print("Enter C number: ");
		double c = input.nextDouble();
		
		if((a < c && c < b) || (a > c && c > b)) {
			System.out.println("Number \"c\" is between number \"a\" and number \"b\".");
		}
		else {
			System.out.println("Number \"c\" is not between number \"a\" and number \"b\".");
		}

	}

}
