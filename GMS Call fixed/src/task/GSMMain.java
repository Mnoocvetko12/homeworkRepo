package task;

public class GSMMain {

	public static void main(String[] args) {
		
		GSM sony = new GSM("Sony");
		sony.insertSimCard("0883456783");
//		System.out.println(sony);

		GSM htc = new GSM("htc");
		htc.insertSimCard("0888765432");
//		System.out.println(htc);

		sony.call(htc, 5);
		System.out.println(htc.printInfoForLastIncomingCall());
//		System.out.println(sony.printInfoForLastOutcomingCall());
		
		
//		System.out.printf("What is my phone tax?%n%.2f euro", sony.getSumForCall());
	}

}
