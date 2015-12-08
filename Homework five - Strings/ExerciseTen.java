import java.util.Scanner;

public class ExerciseTen {

	/*
	 * Да се състави програма, която по даден низ връща друг, символите, на
	 * който са получени като към всеки код на символ от ASCII таблицата е
	 * добавеното числото 5 и е записан новополучения символ.
	 * Вход: Hello
     * Изход: Mjqqt
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String word = input.nextLine();
		System.out.println("Old word: " + word);
			
		newWord(word);	
		
	}

	private static void newWord(String word) {
		char sum = ' ';
		String newWord = "";
		
		for (int i = 0; i < word.length(); i++) {
			sum = (char) (word.charAt(i) + 5);
			newWord += sum;
		}
		
		System.out.println("New word: " + newWord);
		
	}

}
