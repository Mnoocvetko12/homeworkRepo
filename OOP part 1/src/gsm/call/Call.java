package gsm.call;

public class Call {
	
	private final static double PRICE_FOR_A_MINUTE = 0.33;
	
	private GSM caller;
	private GSM reciever;
	private double duration;
	
	
	
	public GSM getCaller() {
		return caller;
	}
	public void setCaller(GSM caller) {
		if(caller != null) {
		this.caller = caller;
		}
	}
	public GSM getReciever() {
		return reciever;
	}
	public void setReciever(GSM reciever) {
		if(reciever != null) {
		this.reciever = reciever; 
		}
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		if(duration > 0) {
		this.duration = duration;
		}
	}
	public static double getPriceForAMinute() {
		return PRICE_FOR_A_MINUTE;
	}
	
	
	
	
	
}
