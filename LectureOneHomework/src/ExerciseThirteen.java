import java.util.Scanner;

public class ExerciseThirteen {
	
	/*
	 *  Да се състави програма, която да отгатне колко е студено/топло по
     *  въведената температура t в градус Целзий.
     *  Температурните интервали са:
     *  под -20 ледено студено;
     *  между 0 и -20 - студено;
     *  между 15 и 0 - хладно;
     *  между 25 и 15 - топло;
     *  над 25 – горещо.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsius between -100 and 100: ");
		double temperature = input.nextDouble();
		while (temperature < -100 || temperature > 100) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter temperature in Celsius between -100 and 100: ");
			temperature = input.nextDouble();
		}
		
		
		if(temperature < -20) {
			System.out.println("Ice cold!");
		}
		else if(temperature < 0) {
			System.out.println("Cold!");
		}
		else if(temperature <= 15) {
			System.out.println("Chilly!");
		}
		else if ( temperature <= 25) {
			System.out.println("Warm!");
		}
		else {
			System.out.println("Hot!");
		}

	}

}
