package exerciseTwo;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	Call calls;

	public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() != 10 || simMobileNumber.charAt(0) != '0' || simMobileNumber.charAt(1) != '8') {
			System.out.println("Invalid mobile number!");
			return;
		} else {
			for (int i = 2; i < simMobileNumber.length(); i++) {
				if (simMobileNumber.charAt(i) < '0' || simMobileNumber.charAt(i) > '9') {
					System.out.println("Invalid mobile number!");
					return;
				}
			}
		}
		if (hasSimCard == false) {
			this.hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
		}
	}

	public void removeSimCard() {
		if (hasSimCard == true) {
			this.hasSimCard = false;
			this.simMobileNumber = "";
		}
	}

	public void call(GSM reciever, double duration) {
		if (reciever == null) {
			System.out.println("Reciever is missing!");
			return;
		}
		if (duration < 0) {
			System.out.println("Invalid duration!");
			return;
		}

		if (this.simMobileNumber.equals(reciever.simMobileNumber)) {
			System.out.println("You can't call yourself!");
			return;
		}
		if (this.hasSimCard != true) {
			System.out.println("You can't call without sim card!");
			return;
		}
		if (reciever.hasSimCard != true) {
			System.out.println("The reciever don't has sim card!");
			return;
		}

		this.calls.duration = duration;
		this.outgoingCallsDuration += duration;	
		reciever.calls.duration = duration;
		reciever.lastIncomingCall = this.lastOutgoingCall;
		reciever.lastOutgoingCall = this.lastIncomingCall;

	}

	public void getSumForCall() {
		if (this.outgoingCallsDuration < 1) {
			System.out.println("You don't have unpaied sums!");
			return;
		} else {
			double sum = this.outgoingCallsDuration * calls.priceForAMinute;
			System.out.println("Sum is: " + sum);
		}

	}

	public void printInfoForLastOutcomingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("Reciever: " + this.calls.receiver);
			System.out.println("Duration: " + this.calls.duration);
		} else {
			System.out.println("You don't have call!");
		}
	}

	public void printInfoForLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println("Caller: " + this.calls.caller);
			System.out.println("Duration: " + this.calls.duration);
		} else {
			System.out.println("You don't have call!");
		}
	}

}
