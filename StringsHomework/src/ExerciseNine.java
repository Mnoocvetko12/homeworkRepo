
import java.util.Scanner;

public class ExerciseNine {

	/*
	 * Да се състави програма, чрез която по въведен низ съдържащ букви, цифри,
	 * знак минус '-' се извежда сборът на въведените числа като се отчита
	 * знакът '-' пред съответното число.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.print("Enter string with letters and integers and char minus: ");
		
		String kasha = input.nextLine();

		String temp = "";
		String num = "";
		int sum = 0;
		boolean printNum = false;
		
		
		for (int i = 0; i < kasha.length(); i++) {
			if(kasha.charAt(i) >= '0' && kasha.charAt(i) <= '9') {
				if(kasha.charAt(i - 1) == '-') {
					temp += kasha.charAt(i - 1);
				}
				temp += kasha.charAt(i);

			    if((i == kasha.length() - 1) && kasha.charAt(kasha.length() - 1) >= '0' && kasha.charAt(kasha.length() - 1) <= '9') {
			        printNum = true;
			        num = temp;
			       }
			}
			else {
				  if( i > 0) {
					     if(kasha.charAt(i - 1) >= '0' && kasha.charAt(i - 1) <= '9') {
					      printNum = true;
					     }
					    }
				num = temp;
				temp = "";
				
			}
			if (printNum) {
				System.out.println(num);
				sum += Integer.parseInt(num);
				printNum = false;
			}
		}
		
		System.out.println("Sum is: " + sum);
		
		
		
	}

}
