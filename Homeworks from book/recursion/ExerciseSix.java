package recursion;



public class ExerciseSix {

	/*
	 * 6. Да се състави програма, която приема за входни данни естествено число
	 * N. Програмата да извежда число, чиито цифри са написани в ред, обратен на
	 * въведеното число. Използвайте рекурсия.
	 */

	public static void main(String[] args) {
		int n = 12345;
		reversNumber(n);
		

	}
	
	public static int reversNumber(int n) {
		if(n == 0) {
			return 1;
		}
	
		int temp = (n % 10);
		
		System.out.print(temp);

		n = reversNumber(n / 10);

		return temp;	
	}

}
