import java.util.Scanner;

// all the knights movement on an NxM matrix from specified coordinates
public class Knight_Chess {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number of rows in the matrix: ");
		int row= scan.nextInt();
		System.out.print("Enter the number of columns in the matrix: ");
		int col= scan.nextInt();
		
		char[][] matrix= new char[row][col];
		System.out.println("Enter the coordinates of the starting point");
		System.out.print("Enter the row number: ");
		int r= scan.nextInt();
		System.out.print("Enter the column number: ");
		int c= scan.nextInt();
		knight(matrix,r,c);
		System.out.println("The movements of the knights on the matrix: ");
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	 static void knight(char[][] matrix, int row, int col) {
		 if(row>matrix.length-1 || row<0){
			 return;
		 }
		 if(col>matrix[row].length-1 || col<0){
			 return;
		 }
		 if(matrix[row][col]!='\0'){
			 return;
		 }
		 matrix[row][col]='♞';
		 knight(matrix, row+2,col-1);
		 knight(matrix, row+2,col+1);
		 knight(matrix, row-2,col-1);
		 knight(matrix, row-2,col+1);
		 knight(matrix, row-1,col+2);
		 knight(matrix, row-1,col-2);
		 knight(matrix, row+1,col-2);
		 knight(matrix, row+1,col+2);
		 
	}

}
