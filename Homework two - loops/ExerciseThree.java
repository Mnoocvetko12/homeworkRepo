
public class ExerciseThree {
	
	/*
	 * ƒа се изведат на екрана всички нечетни числа от -10 до 10
	 */

	public static void main(String[] args) {
		
		int start = -10;
		int end = 10;
		
		for (int i = start; i <= end; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
