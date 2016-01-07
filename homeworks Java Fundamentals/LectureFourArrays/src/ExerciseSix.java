import java.util.Scanner;

public class ExerciseSix {
	
	/*
	 * Напишете програма, която първо чете 2 масива и после извежда
     * съобщение дали са еднакви, и дали са с еднакъв размер.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.print("Enter arrayOne lenght: ");
		int one = input.nextInt();
		
		int[] arrOne = new int[one];
		
		for (int i = 0; i < arrOne.length; i++) {
			System.out.print("Enter a number: ");
			arrOne[i] = input.nextInt();
		}
		
		System.out.print("Enter arrayTwo lenght: ");
		int two = input.nextInt();
		
		int[] arrTwo = new int[two];
		
		for (int i = 0; i < arrTwo.length; i++) {
			System.out.print("Enter a number: ");
			arrTwo[i] = input.nextInt();
		}
		
		if(arrOne.length != arrTwo.length) {
			flag = false;
		}
		else {
			for (int i = 0; i < arrTwo.length; i++) {
				if (arrOne[i] != arrTwo[i]) {
					flag = false;
					break;
				}
			}
		}
		System.out.println("Are they equal? ---> " + flag);

	}

}
