package recursion;

public class ExerciseEight {

	/*
	 * 8. Да се състави програма, която проверява дали въведено естествено число
	 * е просто. Просто е число, което се дели без остатък единствено на 1 и на
	 * себе си. Използвайте рекурсия.
	 */

	public static void main(String[] args) {
		System.out.println("It is Prime? ---> " + itIsPrime(564, 2));
	}
	
	public static boolean itIsPrime(int n, int del) {
		if(n < 3) {
			return true;
		}
		
		if(n == del) {
			return true;
		}
		
		if(n % del == 0) {
			return false;
		}
		
		return itIsPrime(n, del + 1);
	}

}
