
public class ExerciseFour {
	
	/*
	 * Да се прочете масив и да се отпечата дали е огледален.
	 */

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		
		boolean flag = true;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] != array[array.length - i - 1]) {
				flag = false;
			}
		}
		
		System.out.println("Is it palindrome? ----> " + flag);
	}

}
