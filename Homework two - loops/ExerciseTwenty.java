
public class ExerciseTwenty {
	
	/*
	 *  Да се състави програма, чрез която се извежда квадрат от
     *  цифри. Сумите от елементите на произволен ред или стълб са
     *  равни на 45.
	 */

	public static void main(String[] args) {
		
		
		int temp = 1;
		int countNums = 0;
		int row = 0;
		
		for (int i = temp; i < 10 + temp; i++) {
			if(i == 10) {
				i = 0;
			}
			System.out.print(i + " ");
			countNums++;
			
			if( countNums == 10) {
				countNums = 0;
				System.out.println();
				row++;
				i = temp++;
				
				
			}
			 if( row == 10) {
				 break;
			 }
			
		}
		

	}

}
