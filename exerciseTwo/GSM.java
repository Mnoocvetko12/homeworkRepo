package exerciseTwo;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;
	Call calls = new Call();
	

	public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() != 10 || simMobileNumber.charAt(0) != '0' || simMobileNumber.charAt(1) != '8') {
			System.err.println("This is wrong number!");
			return;
		}
		for (int i = 0; i < simMobileNumber.length(); i++) {

			if (simMobileNumber.charAt(i) < '0' || simMobileNumber.charAt(i) > '9') {
				System.err.println("This is wrong number!");
				return;
			}

		}

		if (hasSimCard == false) {
			hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
		}
	}

	public void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = null;
	}

	public void call(GSM receiver, double duration) {

		
//		if(duration < 1 || this.simMobileNumber.equals(receiver) || this.hasSimCard == false || this.reciever.hasSimCard == false) {
//			System.err.println("Invalid duration!");
//			return;
//		}
		
		
		this.lastOutgoingCall = receiver.simMobileNumber;
		
		this.outgoingCallsDuration += duration;
		calls.caller = this.simMobileNumber;
		calls.duration = duration;
	}

	public void getSumForCall() {
		double sum = this.outgoingCallsDuration * calls.priceForAMinute;
		
		System.out.println("Your sum for calls is: " + sum);
	}
	
	
	public void printInfoForLastOutgoingCall() {
		System.out.println("Last outgoing call: " + calls.receiver + "\nduration: " + calls.duration);
	}
	
	public void printInfoForLastIncomingCall() {
		System.out.println("Last incoming call: " + calls.caller + "\nduration: " + calls.duration);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Model: " + this.model + "\n");
		sb.append("Mobile number: " + this.simMobileNumber + "\n");
		sb.append("Call duration: " + this.outgoingCallsDuration + "\n");
		return sb.toString();
	}

	
	
}
