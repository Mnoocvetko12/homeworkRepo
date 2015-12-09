
public class Call {
	float priceForAMinute;
	GSM caller;
	GSM receiver;
	int duration;
	
	void getSumForCall(GSM caller, float priceforAMinute){
		float sum=priceForAMinute * caller.outgoingCallsDuration;
		System.out.println("the total price for the call is "+sum+" lv");
	}
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
		caller.lastOutgoingCall=receiver.simMobileNumber;
		receiver.lastIncomingCall=caller.simMobileNumber;
		
		caller.outgoingCallsDuration+=duration;
		System.out.println("The durations of all the calls is "+caller.outgoingCallsDuration+ " min.");
	}
	void printInfoForTheLastOutgoingCall(){
		System.out.println("caller's last outgoing call "+caller.lastOutgoingCall);
		System.out.println("receiver's last outging call "+receiver.lastOutgoingCall);
		
	}
	void printInfoForTheLastIncomingCall(){
		System.out.println("receiver's last incoming call "+receiver.lastIncomingCall);
		System.out.println("caller's last incoming call "+caller.lastIncomingCall);
		
	}
}
