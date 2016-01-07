import java.util.Scanner;

public class ExerciseFifteen {
	
	/*
	 *  Да се състави програма, която въвежда естествено число от интервала [0..24].
     *  Програмата да изведе съответстващо съобщение съобразно въведения час.
     *  Периодите са:
     *  [18..4] - Добър вечер;
     *  [4..9] - Добро утро;
     *  [9..18] - Добър ден
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 0 and 24: ");
		int num = input.nextInt();
		
		while (num < 0 || num > 24) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number between 0 and 24: ");
			num = input.nextInt();
		}
		
		if(num >= 18 || num <= 4 ) {
			System.out.println("Good evening!");
		}
		else if(num <= 9) {
			System.out.println("Good morning!");
		}
		else {
			System.out.println("Good day!");
		}
	}

}
