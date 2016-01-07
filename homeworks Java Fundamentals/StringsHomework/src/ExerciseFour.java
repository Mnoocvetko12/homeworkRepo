
import java.util.Scanner;

public class ExerciseFour {

	/*
	 * Да се състави програма, чрез която по въведени трите имена на двама
	 * човека разделени със запетая, се извежда чие име има по-голям сбор от
	 * ASCII кодовете на съставящите името букви. 
	 * Пример: Anna Dosewa Asenowa,
	 * Iwo Peew Peew
	 * Изход: Anna Dosewa Asenowa
	 */

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String names = "";
	
		
		do {
			System.out.print("Enter two full names divided by \",\": ");
			names = input.nextLine();
		} while (validData(names));
		
		System.out.println(biggestName(names, ","));
		
		
		
	}

	static String biggestName(String names, String div) {
		  
		  String[] token = names.split(div);
		  String biggest = null;
		  int sum = 0;
		  int maxSum = 0;

		  for(int i = 0; i < token.length; i++) {
		   String temp = token[i].trim();
		   for(int j = 0; j < temp.length(); j++) {
		    sum += temp.charAt(j);
//		    System.out.println(sum + " - " + temp.charAt(j));
		   }
		   if(sum > maxSum) {
		    maxSum = sum;
		    biggest = temp;
		   }
		   
		   sum = 0;
		  }
		  
		  return biggest;
		 }
	
	
	
	public static boolean validData(String names) {
		boolean flag = true;
		
		for (int i = 0; i < names.length(); i++) {
			if(names.charAt(i) == ',') {
				flag = false;
				break;
			}
		}
		return flag;
		
	}

}
