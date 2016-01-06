package war.game2;

public class Main {

	public static void main(String[] args) {
		
		Game gm = new Game();
		try {
			gm.gameEngine();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
