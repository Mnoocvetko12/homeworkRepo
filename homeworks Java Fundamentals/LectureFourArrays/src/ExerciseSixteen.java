
public class ExerciseSixteen {
	
	/*
	 *  Да се състави програма, чрез която предварително въведени 10
     *  реални числа от интервала се обработват по следния начин:
     *  1. Извежда съществуващите числа.
     *  2. Всички елементи със стойност по-малки от -0.231 се заменят със
     *  сумата от квадрата на индекса им + числото 41.25, а всички останали
     *  елементи се заменят с произведението между самия елемент и
     *  неговият пореден номер
     *  3. Да се изведат елементите от началния и новообразувания масив.
     *  4. Да се изведат средната стойност на всички елементи от новата
     *  редица, които са различни от 0.
	 */

	public static void main(String[] args) {
		
		double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		System.out.println();
		
		double[] arrayTwo = new double[array.length];
		
		for (int i = 0; i < arrayTwo.length; i++) {
			if (array[i] < -0.231) {
				arrayTwo[i] = ((i + 1) * (i + 1)) + 41.25;
				
			}
			else {
				arrayTwo[i] = array[i] * (i + 1);
			}
		}
		
	
		System.out.println();
		System.out.print("Array two: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + "; ");
			
		}
		
		System.out.println();
		
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arrayTwo.length; i++) {
			if(arrayTwo[i] != 0) {
				count++;
				sum = sum + arrayTwo[i];
			}
		}
		
		double average = sum / count;
		System.out.println("Average: " + average);
		
	}

}
