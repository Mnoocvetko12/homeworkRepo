import java.util.Scanner;

public class ExerciseEleven {
	
	/*
	 *  Да се състави програма, която въвежда от клавиатурата 7 цели числа
     *  в едномерен масив
     *  Програмата да изведе всички числа кратни на 5, но по големи от 5.
     *  Пример: -23, -55, 17, 75, 56, 105, 134
     *  Изход: 75,105 2 числа
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arrOne = new int[7];

		for (int i = 0; i < arrOne.length; i++) {
			System.out.print("Enter a number: ");
			arrOne[i] = input.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < arrOne.length; i++) {
			if (arrOne[i] > 5 && arrOne[i] % 5 == 0) {
				count++;
				System.out.print(arrOne[i] + " ");
			}

		}
		
		System.out.print("---> " + count + " numbers");

		

	}

}
