
public class ExerciseTwentyThree {
	
	/*
	 *  Да се състави програма, която чрез цикъл while извежда
     *  таблицата за умножение, но без повторение.
     *  Т.е. ако е изведено 4*5 не се извежда 5*4.
	 */

	public static void main(String[] args) {
		
		int multiplier1 = 1;
		int multiplier2 = 1;
		
		
		while (multiplier1 <= 9 && multiplier2 <= 9) {
			
			System.out.print( multiplier1 + "*" + multiplier2 + "; ");
			multiplier2++;
			
			if(multiplier2 == 10) {
				System.out.println();
				
				multiplier1++;
				multiplier2 = multiplier1;
			}
			
		}

	}

}
