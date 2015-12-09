
public class Computer {
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		this.operationSystem=newOperationSystem;
	}
	
	void useMemory(int memory){
		if(memory> this.freeMemory){
			System.out.println("Not enough free memory!");
			return;
		}else{
			this.freeMemory=memory;
		}
		System.out.println("The free memory has been reduced to "+ this.freeMemory);
	}
	
	void print(){
		System.out.println("Computer was made in "+ this.year+ " , works with an OS "+this.operationSystem+
			" has HD memory of "+ this.hardDiskMemory+" GB, has free memory of "+this.freeMemory+" MB and is laptop -"+this.isNotebook);
	}
}
