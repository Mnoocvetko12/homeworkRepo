package stringsExercises;

public class ExerciseFive {

	/*
	 * 5. Да се състави програма, която приема за входни данни дума. Програмата
	 * да извежда като резултат друга дума, като буквите й са получени като към
	 * всеки код на буква от ASCII таблицата е добавено числото 5 и е записана
	 * новополучената буква.
	 */

	public static void main(String[] args) {
		String text = "Hello";
		String newString = "";
		char temp = 0;
		for (int i = 0; i < text.length(); i++) {
			temp = (char) (text.charAt(i) + 5);
			newString += temp;
		}

		System.out.println(newString);
	}

}
