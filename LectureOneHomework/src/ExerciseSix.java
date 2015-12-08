import java.util.Scanner;

public class ExerciseSix {
	
	/*
	 * Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
     * им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
     * а3 да има старата стойност на а1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number one: ");
		int a1 = input.nextInt();
		System.out.print("Enter number two: ");
		int a2 = input.nextInt();
		System.out.print("Enter number three: ");
		int a3 = input.nextInt();
		
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println(a1 + "\n" + a2 + "\n" + a3);

	}

}
