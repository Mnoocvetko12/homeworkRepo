package recursion;

public class ExerciseOne {

	/*
	 * 1. Да се състави програма, която приема за входни данни естествено число
	 * N и изписва на екрана стойността на N! (N факториел). Факториел на число
	 * N се изчислява чрез умножение на всички числа от 1 до N. Използвайте
	 * рекурсия.
	 */

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static long factorial(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}
