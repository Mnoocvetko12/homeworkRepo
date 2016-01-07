import java.util.Scanner;

public class ExerciseNineteeen {
	
	/*
	 *  Да се състави програма, чрез която по въведено
     *  естествено число от интервала [10..99] се извежда поредица
     *  числа, при спазване на следните изисквания:
     *  1) ако предходното число е четно се извежда 0.5*числото;
     *  2) ако предходното число е нечетно се извежда 3*числото +1.
     *  Извеждането продължава докато не се получи стойност 1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 10 and 99: ");
		int num = input.nextInt();
		while (num < 10 || num > 99) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 10 and 99: ");
			num = input.nextInt();
			
		}
		
		while (num != 1) {
			if(num % 2 == 0) {
				num /= 2;
				System.out.print(num + " ");
			}
			else {
				num = (num * 3) + 1;
				System.out.print(num + " ");
			}
			
		}

	}

}
