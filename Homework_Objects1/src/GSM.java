
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber){
		if(hasSimCard==false){			
			if((simMobileNumber.length()<10 || simMobileNumber.length()>10) ||!simMobileNumber.startsWith("08") ){
				System.out.println("The mobile number is incorrect or not full.");
				return;
			}
			else{
				this.simMobileNumber=simMobileNumber;
				hasSimCard=true;
			}
		}
	}
	void removeSimCard(){
		if(hasSimCard==true){
			hasSimCard=false;
			//simMobileNumber=null;
		}
	}
	void printInfoForTheLastOutgoingCall(){
		System.out.println(this.lastOutgoingCall);
		
	}
	void printInfoForTheLastIncomingCall(){
		System.out.println(this.lastIncomingCall);
		
	}

}
