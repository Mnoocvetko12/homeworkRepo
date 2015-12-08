package stringsExercises;

public class ExerciseFour {

	/*
	 * 4. Да се състави програма, която приема за входни данни низ от символи.
	 * Програмата да извежда дали подадения низ е палиндром. Палиндром е такъв
	 * низ, който се чете по един и същ начин отляво- надясно и отдясно-наляво.
	 */

	public static void main(String[] args) {
		
		String text = "abcdefgfehcba";
		boolean isItPalindrome = true;
		
//		System.out.println(text.charAt(text.length()-1));
		
		for (int i = 0; i < text.length()/2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				isItPalindrome = false;
				break;
			}
		}
		
		if (isItPalindrome) {
			System.out.println("The string is palindrome!!");
		}
		else {
			System.out.println("The string isn't palindrome!");
		}
		

	}

}
