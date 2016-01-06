package gsm.call;

public class GSM {

	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outgoingCallsDuration;
	private GSM lastIncomingCall;
	private GSM lastOutgoingCall;

	public GSM(String model) {
		setModel(model);
	}

	public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null && simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8'
				&& simMobileNumber.length() == 10) {
			setSimMobileNumber(simMobileNumber);
			setHasSimCard(true);
		} else {
			System.out.println("Invlaid phone number!");
		}
	}

	public void removeSimCard() {
		if (isHasSimCard()) {
			setHasSimCard(false);
			setSimMobileNumber("null000000");
		}
	}

	public void call(GSM receiver, int duration) {
		if (receiver != null) {
			if (duration > 0 && !(this.getSimMobileNumber().equals(receiver.getSimMobileNumber()))
					&& this.isHasSimCard() == true && receiver.isHasSimCard() == true) {
				this.setLastOutgoingCall(receiver);
				this.setOutgoingCallsDuration(duration);
				receiver.setLastIncomingCall(this);
				receiver.setOutgoingCallsDuration(duration);
			}
		}
	}

	public void printInfoForTheLastOutgoingCall() {
		if (getLastOutgoingCall() != null) {
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.append("phone on receiver: " + getLastOutgoingCall().getSimMobileNumber()
					+ "\nduration: " + getOutgoingCallsDuration() + "\n"));

		}
	}

	public void printInfoForTheLastIncomingCall() {
		if (getLastIncomingCall() != null) {
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.append("phone on caller: " + getLastIncomingCall().getSimMobileNumber()
					+ "\nduration: " + getOutgoingCallsDuration() + "\n"));
		}
	}
	
	public double getSumForCall() {
		Call call = new Call();
		double sum = this.getOutgoingCallsDuration() * call.getPriceForAMinute();
		
		return sum;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("model: " + getModel() + "\n");
		sb.append("sim mobile number: " + getSimMobileNumber() + "\n");

		return sb.toString();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}

	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		if (simMobileNumber != null && simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
		}
	}

	public int getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public void setOutgoingCallsDuration(int outgoingCallsDuration) {
		if (outgoingCallsDuration > 0) {
			this.outgoingCallsDuration = outgoingCallsDuration;
		}
	}

	public GSM getLastIncomingCall() {
		return lastIncomingCall;
	}

	public void setLastIncomingCall(GSM lastIncomingCall) {
		if (lastIncomingCall != null) {
			this.lastIncomingCall = lastIncomingCall;
		}
	}

	public GSM getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	public void setLastOutgoingCall(GSM lastOutgoingCall) {
		if (lastOutgoingCall != null) {
			this.lastOutgoingCall = lastOutgoingCall;
		}
	}

}
