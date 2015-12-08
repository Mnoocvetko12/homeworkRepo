import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class ExerciseEleven {
		
	/*
	 * Въведете число N чрез конзолата и изкарайте като
     * резултат следния триъгълник с височина N:
     *     *   
     *    ***  
     *   ***** 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		char star = '*';
	
		
		//triangle3	 
		
		for(int row = 0; row < num; row++) {
			for(int col = 1; col <= (num * 2); col++) {
				
				if(num - row <= col && num + row >= col ) {
				System.out.print(star);
				
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println();
		
		
		
		//еmpty triangle
		
		for(int row = 0; row < num; row++) {
			for(int col = 1; col < (num * 2); col++) {
				
				if(num - row == col || num + row == col ) {
				System.out.print(star);
				
				}
				else {
					if(row == num-1) {
						System.out.print(star);
					}
					else {
					System.out.print(" ");
					}
				}
			}

			System.out.println();
		}
		System.out.println();
		
		

	}

}
