import java.util.Scanner;

public class ExerciseThree {
	
	/*
	 *  Да се въведе число, след което да се създаде масив с 10
     *  елемента по следния начин:
     *  Първите 2 елемента на масива са въведеното число.
     *  Всеки следващ елемент на масива е равен на сбора от
     *  предишните 2 елемента в масива.
     *  След това изведете масива .
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int [] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			if(i < 2) {
				array[i] = num;
			}
			else {
				array[i] = array[i-2] + array[i-1];
				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
