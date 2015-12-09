package exerciseTwo;

public class GSMMain {

	public static void main(String[] args) {
		
		GSM pesho = new GSM();
		pesho.model = "Sony";
		pesho.insertSimCard("0887653211");
		
		
		System.out.println(pesho + "\n");
		
		GSM mariika = new GSM();
		mariika.model = "LG";
		mariika.insertSimCard("0888123456");
		
		System.out.println(mariika + "\n");
		
//		pesho.reciever = mariika;
//		
//		pesho.call("0888123456", 15);
//		pesho.call("0888123456", 13);
		
		System.out.println(pesho + "\n");
		System.out.println(mariika + "\n");
		
		pesho.getSumForCall();
		
		mariika.printInfoForLastIncomingCall();
		pesho.printInfoForLastOutgoingCall();

	}

}
