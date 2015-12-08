import java.util.Scanner;

public class ExerciseTwelve {
	
	/*
	 *  Високосни години са всички години кратни на 4 с изключения
     *  столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
     *  но 1600 и 2000 са високосни.
     *  Съставете програма, която по дадени ден, месец, година отпечатва
     *  следващата дата.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter day: ");
		int day = input.nextInt();
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		

		if((day < 1 || day > 31 ) || (month < 1 || month > 12)) {
			System.out.println("Invalid input try again!");
			
		}
		else if(day == 31 &&  month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.printf("This month has only 30 days try again!");
			
		}
		else if((day > 28 && month == 2) && !((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
			System.out.println("This isn't leap-year try again!");
			
		}
		else if(day > 29 && month == 2) {
			System.out.println("This month has only 29 days try again!");
			
		}
		else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (day == 31) {
					day = 1;
					month++;
				}
				else {
					day++;
				}
				
				break;

			case 12:
				if (day == 31) {
					day = 1;
					month = 1;
					year++;
				}
				else {
					day++;
				}
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				if (day == 30) {
					day = 1;
					month++;
				}
				else {
					day++;
				}
				break;
				
			case 2:
				if(((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
					if(day == 29) {
						day = 1;
						month++;	
					}
					else {
						day++;
					}
				} 
				else {
					if(day == 28) {
						day = 1;
						month++;
					}
					else {
						day++;
					}
				}
				
				break;

			default:
				System.out.println("Invalid input!!!");
				break;
			}
			System.out.println(day + " " + month + " " + year);
		}

	}

}
