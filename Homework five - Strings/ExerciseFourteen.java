import java.util.Scanner;

public class ExerciseFourteen {

	/*
	 * Да се състави метод, който приема за стойност число N и връща стойността
	 * на N! (N факториел).
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		System.out.println(factorial(n));
		System.out.println(factorialTwo(n));

	}
	
	public static long factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static long factorialTwo(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i; 
		}
		
		return fac;
	}

}
