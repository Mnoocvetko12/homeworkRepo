import java.util.Scanner;

public class ExerciseTen {

	/*
	 * Да се състави програма, чрез която се въвеждат 7 цели числа в едномерен
	 * масив. Програмата да изведе числото, което е най-близко до средната
	 * стойност на въведените числа. Пример: 1,2,3,4,5,6,7 Изход: средна
	 * стойност 4, най-близка стойност 4
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array length: ");
		int[] arrOne = new int[input.nextInt()];
		double sum = 0;
		
		for (int i = 0; i < arrOne.length; i++) {
			System.out.print("Enter a number: ");
			arrOne[i] = input.nextInt();
			sum += arrOne[i];
		}

		

//		for (int i = 0; i < arrOne.length; i++) {
//			sum += arrOne[i];
//
//		}
		double average = sum / arrOne.length;
		// System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		// вариант с фор цикъл
		double difference = Double.MAX_VALUE;
		double temp = 0;
		int num = 0;

		for (int i = 0; i < arrOne.length; i++) {
			temp = average - arrOne[i];
			if (temp < 0) {
				temp *= -1;
			}
			if (difference >= temp) {
				difference = temp;
				num = arrOne[i];
			}
		}
		System.out.println("Element: " + num);

		// вариант с while цикъл

		// int element = 0;
		// int index = 0;
		// int count = 0;
		// int countMax = Integer.MAX_VALUE;
		//
		// while(index < arrOne.length) {
		// int temp = arrOne[index];
		// while(true) {
		//
		// if(arrOne[index] == average) {
		// if(count < countMax) {
		// countMax = count;
		// element = temp;
		// }
		// break;
		// }
		// if(arrOne[index] < average) {
		// arrOne[index]++;
		// }
		// else {
		// arrOne[index]--;
		// }
		// count++;
		// }
		// count = 0;
		// index++;
		// }
		//
		// System.out.println(element);

	}

}
