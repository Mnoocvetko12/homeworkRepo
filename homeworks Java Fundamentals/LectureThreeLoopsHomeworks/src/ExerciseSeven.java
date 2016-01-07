import java.util.Scanner;

public class ExerciseSeven {

	/*
	 * Започвайки от 3, да се изведат на екрана първите n числа които се делят
	 * на 3. Числата да са разделени със запетая.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int start = input.nextInt();

		while (start < 0) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number > 0: ");
			start = input.nextInt();
		}

		int number = 3;
		int end = 0;
		while (start > 0) {
			System.out.print(number);
			number +=3;
			start--;
			if(start == end) {
				break;
			}
			System.out.print(",");
			
		}
	
	}
}
