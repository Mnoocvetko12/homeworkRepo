
public class GSM_Call_Objects {

	public static void main(String[] args) {
		GSM mobile= new GSM();
		GSM mobile2= new GSM();
		
		mobile.hasSimCard=true;
		mobile.simMobileNumber="0899999999";
		mobile2.hasSimCard=true;
		mobile2.simMobileNumber="0877777777";
		
		Call ring= new Call();
		
		ring.caller=mobile;
		ring.receiver=mobile2;
		
		ring.call(ring.receiver, 50);
		ring.getSumForCall(ring.caller, ring.priceForAMinute);
		ring.caller.printInfoForTheLastIncomingCall();
		ring.caller.printInfoForTheLastOutgoingCall();
		
		
		GSM mobile3= new GSM();
		mobile3.hasSimCard=true;
		mobile3.simMobileNumber="0866666666";
		
		ring.caller=mobile3;
		ring.receiver=mobile;
		
		ring.call(ring.receiver, 30);
		ring.getSumForCall(ring.caller, ring.priceForAMinute);
		ring.caller.printInfoForTheLastIncomingCall();
		ring.caller.printInfoForTheLastOutgoingCall();
		
		ring.caller=mobile;
		ring.receiver=mobile3;
		ring.call(ring.receiver, 25);
		ring.getSumForCall(ring.caller, ring.priceForAMinute);
		ring.caller.printInfoForTheLastIncomingCall();
		ring.caller.printInfoForTheLastOutgoingCall();
	}
		
		
}
