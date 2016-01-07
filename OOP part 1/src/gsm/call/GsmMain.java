package gsm.call;

public class GsmMain {

	public static void main(String[] args) {
		
		GSM pesho = new GSM("Nokia");
		GSM misho = new GSM("Sony");
		
		pesho.insertSimCard("0883376049");
		misho.insertSimCard("0878324581");
		
		System.out.println(pesho);
		
		pesho.call(misho, 12);
		
		pesho.printInfoForTheLastOutgoingCall();
		System.out.println(pesho.getSumForCall());
//		misho.printInfoForTheLastIncomingCall();
		
	}
}
