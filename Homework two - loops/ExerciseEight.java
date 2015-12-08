import java.util.Scanner;

public class ExerciseEight {
	
	/*
	 * По зададено число n, да се изведе на екрана таблица по следния начин:
	 * Въведете n: 3  Въведете n: 4
     * 222   		  3333
     * 444			  5555
     * 666         	  7777
     * 				  9999
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		while (n < 1) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter n: ");
			n = input.nextInt();	
		}

		
		for (int i = n; i <= (n*3)-1; i+=2) {
			for (int j = 0; j < n; j++) {
				System.out.print(i - 1 + " ");
			}
			System.out.println();
		}
	}

}
