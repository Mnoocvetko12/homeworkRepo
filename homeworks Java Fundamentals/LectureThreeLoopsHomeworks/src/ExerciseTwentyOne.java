import java.util.Scanner;

public class ExerciseTwentyOne {

	/*
	 * Дадено е наредено тесте карти. Наредбата по тежест на карта е:
	 * 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо. Наредбата по цвят на картите е:
	 * спатия, каро, купа, пика. Да се създаде програма, чрез която се въвежда N
	 * - число от интервала [1..51] и се извеждат въведения номер карта и
	 * останалите по-големи карти от тестето.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();
		while (num < 1 || num > 52) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 1 and 52: ");
			num = input.nextInt();

		}

		String cards = "";
		int card;
		 int suit = num % 4;
		 if (suit==0) {
			 suit=4;	
		}
		
	 if (num==1 || num==2 || num==3) {
		 card = 1;
		 
	}
	 if(num % 4 == 0) {
		 card = num / 4;
	 }
	 else {
		 card = num / 4;
		 card++;
	 }
	 
	 
		  while(card <= 13) {
 
		   while(suit <= 4) {
			 
		    switch(card) {
		     case 1: cards += "2 "; break;
		     case 2: cards += "3 "; break;
		     case 3: cards += "4 "; break;
		     case 4: cards += "5 "; break;
		     case 5: cards += "6 "; break;
		     case 6: cards += "7 "; break;
		     case 7: cards += "8 "; break;
		     case 8: cards += "9 "; break;
		     case 9: cards += "10 "; break;
		     case 10: cards += "J "; break;
		     case 11: cards += "Q "; break;
		     case 12: cards += "K "; break;
		     case 13: cards += "A "; break;
		      default: break;
		    }
		    switch(suit) {
		    case 1: cards += "club; "; break;
		    case 2: cards += "diamond; "; break;
		    case 3: cards += "heart; "; break;
		    case 4: cards += "spade; "; break;
		     default: break;
		    }
		    suit++;
		    
		   }
		   suit = 1;
		   card++;
		  
		  }
		  System.out.println(cards);
		
		  
		}

	}


