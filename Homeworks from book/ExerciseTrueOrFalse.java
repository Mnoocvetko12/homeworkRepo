import java.util.Scanner;

public class ExerciseTrueOrFalse {

	/*
	 * Да се състави програма, която по въведено цяло число отпечатва истина или
	 * лъжа(true или false) в зависимост от това дали числото се дели на 2.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();

		System.out.println(divisionByTwo(num));
		
	}

	public static boolean divisionByTwo(int num) {
		boolean flag = false;
		
		if(num % 2 == 0) {
			flag = true;
		}
		
		return flag;
	}

}
