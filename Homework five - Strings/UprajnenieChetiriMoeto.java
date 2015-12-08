import java.util.Scanner;

public class UprajnenieChetiriMoeto {

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
		
		
		biggestName(names);
		
		
	}

	public static void biggestName(String names) {

		String firstName = "";
		String secondName = "";
		String[] arrayNames = names.split(", ");
		
		for (int i = 0; i < arrayNames.length; i++) {
			if (i < arrayNames.length/2) {
				firstName += arrayNames[i];
			}
			else {
				secondName += arrayNames[i];
			}
		}
		
		int firstSum = 0;

		for (int i = 0; i < firstName.length(); i++) {
			if(firstName.charAt(i) != ' ') {
				firstSum += firstName.charAt(i);
//				System.out.println(firstSum + " " + firstName.charAt(i));
			}
			
		}
		
		int secondSum = 0;
		
		for (int i = 0; i < secondName.length(); i++) {
			if (secondName.charAt(i) != ' ') {
				secondSum += secondName.charAt(i);
//				System.out.println(secondName + " " + secondName.charAt(i));
				
			}
			
		}
		
		if(firstSum == secondSum) {
			System.out.println("They are equals!");
			System.out.println(firstName + "\n" + secondName);
		}
		else {
			if(firstSum > secondSum) {
				System.out.println(firstName);
			}
			else {
				System.out.println(secondName);
			}
		}
		
		
		
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
