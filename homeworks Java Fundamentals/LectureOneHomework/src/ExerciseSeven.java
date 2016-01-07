import java.util.Scanner;

public class ExerciseSeven {
	
	/*
	 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
     * пари (число с плаваща запетая), дали съм здрав – булев тип.
     * Съставете програма, която взема решения на базата на тези данни по
     * следния начин:
     * - ако съм болен, няма да излизам
     * - ако имам пари, ще си купя лекарства
     * - ако нямам – ще стоя вкъщи и ще пия чай
     * - ако съм здрав, ще отида на кино с приятели
     * - ако имам по-малко от 10 лв, ще отида на кафе.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer between 0 and 23: ");
		int hour = input.nextInt();
		System.out.print("Enter your money: ");
		float money = input.nextFloat();
		System.out.print("Are you healthy? Enter true or false: ");
		boolean amIHealthy = input.hasNext();
		
		if(amIHealthy == true && money <= 10) {
		
				System.out.println("I go to cafe.");
	
		}
		else if(amIHealthy == true && money > 10) {
			
			System.out.println("I go to the movies with friends");
		}
		
		else if(amIHealthy == false ) {
			System.out.println("Stay at home!");
	
		}
		else if(amIHealthy == false && money == 0) {
			System.out.println("I'll stay home and drink tea!");
		}
		else {
			System.out.println("I will buy drugs.");
		}
		}

	}


