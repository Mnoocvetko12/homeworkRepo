import java.util.Scanner;

public class ExerciseTwentyTwo {
	
	/*
	 *  Да се състави програма, която извежда първите 10 най-малки
     *  числа, които се делят на 2, 3 или на 5 и които са по-големи от
     *  въведено естествено число.
     *  Числата се извеждат, заедно с техния пореден номер.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int count = 1;
		
		while (count < 11) {
			num++;
			if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				
				System.out.printf("%d:%d", count, num);
				count++;
			}
			
			if(count == 11) {
				break;
			}
			System.out.print(", ");
		}
		
	}

}
