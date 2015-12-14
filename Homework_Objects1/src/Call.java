
public class Call {
	float priceForAMinute=0.1f;
	GSM caller;
	GSM receiver;
	int duration;
	
	void call(GSM receiver, int duration){
		if(receiver.hasSimCard==false || caller.hasSimCard==false){
			System.out.println("The receiver has no SIM card");
			return;
		}
		if(caller.simMobileNumber.equals(receiver.simMobileNumber)){
			System.out.println("the person is calling himself");
			return;
		}
		if((receiver.simMobileNumber.length()<10 || receiver.simMobileNumber.length()>10) || !receiver.simMobileNumber.startsWith("08")){
			System.out.println("The receiver's phone number is incorrect.");
			return;
		}
		if(caller.simMobileNumber.length()<10 || caller.simMobileNumber.length()>10 || !caller.simMobileNumber.startsWith("08")){
			System.out.println("The number is incorrect");
			return;
		}
		if(duration<0){
			System.out.println("the duration has to be a positive, integer number.");
			return;
		}
		this.caller.lastOutgoingCall=this.receiver.simMobileNumber;
		this.receiver.lastIncomingCall=this.caller.simMobileNumber;
		
		this.caller.outgoingCallsDuration+=duration;
		System.out.println("The durations of all the calls for "+this.caller.simMobileNumber+" is " +this.caller.outgoingCallsDuration+ " min.");
	}
	void getSumForCall(GSM caller, float priceforAMinute){
		float sum=priceForAMinute * caller.outgoingCallsDuration;
		System.out.println("the total price for the call is "+sum+" lv");
	}
	
}
