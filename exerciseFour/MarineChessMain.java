package exerciseFour;

public class MarineChessMain {

	public static void main(String[] args) {
		char[][] table = {{ '0', '1', '2', '3' }, 
		                  { '1', '*', '*', '*' }, 
		                  { '2', '*', '*', '*' },
		                  { '3', '*', '*', '*' }};
		
		MarineChess.game(table);
		

	}

}
