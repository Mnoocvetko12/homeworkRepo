package exerciseTwo;

public class GSMMain {

	public static void main(String[] args) {
		
	GSM pesho = new GSM();
	pesho.model = "Sony";
	pesho.insertSimCard("0887123456");
	
	
	GSM misho = new GSM();
	misho.model = "LG";
	misho.insertSimCard("0883654879");
	
	pesho.call(misho, 12);
	
	pesho.getSumForCall();
	pesho.printInfoForLastOutcomingCall();
//	misho.printInfoForLastIncomingCall();
			

	}

}
