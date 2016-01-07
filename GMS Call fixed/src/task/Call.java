package task;

public class Call {
	
	private static final int MIN_CALL_DURATION = 1;

	private static final double PRICE_FOR_MINUTE = 0.37;
	
	private GSM caller;
	private GSM receiver;
	private int duration;

	
	public GSM getCaller() {
		return caller;
	}
	public void setCaller(GSM caller) {
		if(caller != null) {
		this.caller = caller;
		}
	}
	public GSM getReceiver() {
		return receiver;
	}
	public void setReceiver(GSM receiver) {
		if(receiver != null) {
		this.receiver = receiver;
		}
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		if(duration >= MIN_CALL_DURATION) {
		this.duration = duration;
		}
		else {
			this.duration = MIN_CALL_DURATION;
		}
	}
	public static double getPriceForMinute() {
		return PRICE_FOR_MINUTE;
	}
	
	

}
