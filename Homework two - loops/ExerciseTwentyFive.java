import java.util.Scanner;



public class ExerciseTwentyFive {
	
	/*
	 * Да се направи програма, която по дадено число N, да изчислява
     * N!, т.е. 1*2*3*4...*N.
     * Използвайте цикъл do-while.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 1 and 25: ");
		int num = input.nextInt();
        //съжалявам за проверката но надскача капацитета на променливата 
		while (num < 1 || num > 25) {
				System.out.println("Invalid input!!!");
				System.out.print("Enter number between 1 and 25: ");
				num = input.nextInt();
			
		}
		
		
		int count = 1;
		long prod = 1;
		
		do {
			prod *= count;
			count++;
		} while (count <= num);
		System.out.println(prod);
	}

}
