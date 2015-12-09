package exerciseOne;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	
	public void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}
	
	public void useMemory(double memory) {
		if(this.freeMemory > memory) {
			this.freeMemory = this.freeMemory - memory;
		}
		else {
			System.err.println("Not enough free memory!!!");
		}
	}

	@Override
	public String toString() {
		return "Computer [ year = " + year + ", price = " + price + ", isNotebook = " + isNotebook + ", hardDiskMemory = "
				+ hardDiskMemory + ",\nfreeMemory = " + freeMemory + ", operationSystem = " + operationSystem + " ]";
	}
	
	
	
}
