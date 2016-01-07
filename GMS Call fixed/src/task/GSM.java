package task;

public class GSM {

	private static final int MOBILE_NUMBER_LENGTH = 10;
	private static final int MIN_CALL_DURATION = 1;
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	public GSM() {
		setModel("unknown");
		setHasSimCard(false);
		setSimMobileNumber("unknown000");
		setOutgoingCallsDuration(0);
	}

	public GSM(String model) {
		this();
		setModel(model);
	}

	public void insertSimCard(String simMobileNumber) {
		if (numberValidation(simMobileNumber)) {
			setSimMobileNumber(simMobileNumber);
			setHasSimCard(true);
		} else {
			System.out.println("Insert valid number!");
		}
	}

	public boolean numberValidation(String simMobileNumber) {
		if (simMobileNumber.length() == MOBILE_NUMBER_LENGTH && simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8') {
			return true;
		}
		return false;
	}

	public void removeSimCard() {
		setHasSimCard(false);
		setSimMobileNumber("unknown0000");
	}

	public void call(GSM receiver, int duration) {
		Call newCall = new Call();

		if (callValidation(receiver, duration)) {
			newCall.setDuration(duration);
			newCall.setCaller(this);
			newCall.setReceiver(receiver);

			this.setLastOutgoingCall(newCall);
			receiver.setLastIncomingCall(newCall);

			setOutgoingCallsDuration(duration);
		}

	}

	public boolean callValidation(GSM receiver, int duration) {
		if (receiver != null && receiver.isHasSimCard() && this.isHasSimCard()) {
			if (duration >= MIN_CALL_DURATION && !this.getSimMobileNumber().equals(receiver.getSimMobileNumber()) && this != receiver) {
				return true;
			}
		}
		return false;
	}
	
	public double getSumForCall() {
		double sum = getOutgoingCallsDuration() * Call.getPriceForMinute();
		return sum;
	}
	
	public String printInfoForLastIncomingCall() {
		if(getLastIncomingCall() != null) {
		StringBuilder sb = new StringBuilder();
		sb.append("Last caller phone model: " + getLastIncomingCall().getCaller().getModel() + "\n");
		sb.append("Last caller phone number: " + getLastIncomingCall().getCaller().getSimMobileNumber() + "\n");
		sb.append("Last call duration: " + getLastIncomingCall().getDuration());
		
		return sb.toString();
		}
		return "There isn't last incoming calls.";
		
	}
	
	public String printInfoForLastOutcomingCall() {
		if(getLastOutgoingCall() != null) {
		StringBuilder sb = new StringBuilder();
		sb.append("Last receiver phone model: " + getLastOutgoingCall().getReceiver().getModel() + "\n");
		sb.append("Last receiver phone number: " + getLastOutgoingCall().getReceiver().getSimMobileNumber() + "\n");
		sb.append("Last call duration: " + getLastOutgoingCall().getDuration());
		
		return sb.toString();
		}
		return "There isn't last outgoing calls.";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("model: " + getModel() + "\n");
		sb.append("has sim card: " + isHasSimCard() + "\n");
		sb.append("phone number: " + getSimMobileNumber() + "\n");
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

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		if (simMobileNumber != null) {
			this.simMobileNumber = simMobileNumber;
		}
	}

	public int getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public void setOutgoingCallsDuration(int outgoingCallsDuration) {
		if (outgoingCallsDuration >= MIN_CALL_DURATION) {
			this.outgoingCallsDuration += outgoingCallsDuration;
		} else {
			this.outgoingCallsDuration += MIN_CALL_DURATION;
		}
	}

	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	public void setLastIncomingCall(Call lastIncomingCall) {
		if (lastIncomingCall != null) {
			this.lastIncomingCall = lastIncomingCall;
		}
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	public void setLastOutgoingCall(Call lastOutgoingCall) {
		if (lastOutgoingCall != null) {
			this.lastOutgoingCall = lastOutgoingCall;
		}
	}

	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	

}
