package exerciseOne;

public class Computer {

	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		setYear(year);
		setPrice(price);
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);

	}

	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		setNotebook(isNotebook);
		setOperationSystem(operationSystem);

	}

	public int comparePrice(Computer computer) {
		int num = 0;
		if (computer != null) {

			if (this.price > computer.price) {
				num = -1;
			}
			if (this.price == computer.price) {
				num = 0;
			}
			if (this.price < computer.price) {
				num = 1;
			}
			
		}
		return num;
	}
	
		public void showCompareInfo(Computer computer) {
			
			int result = comparePrice(computer);
			if (result == -1) {
				System.out.println("My computer is expensive!");
			} else {
				if (result == 0) {
					System.out.println("Their price are the same!");
				} else {
					System.out.println("The îther computer is expensive!");
				}
			}
		}
	
	

	public void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	public void useMemory(double memory) {
		if (memory > 0) {
			if (this.freeMemory > memory) {
				this.freeMemory = this.freeMemory - memory;
			} else {
				System.err.println("Not enough free memory!!!");
			}
		} else {
			System.out.println("Invalid memory!");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("year: " + this.year + "\n");
		sb.append("price: " + this.price + "\n");
		sb.append("notebook: " + this.isNotebook + "\n");
		sb.append("hard memory: " + this.hardDiskMemory + "\n");
		sb.append("free memory: " + this.freeMemory + "\n");
		sb.append("OS: " + this.operationSystem + "\n");

		return sb.toString();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1939 || year < 2016) {
			this.year = year;
		} else {
			this.year = 2015;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 123;

		}
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = 200;
		}
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		if (freeMemory >= 0) {
			this.freeMemory = freeMemory;
		} else {
			this.freeMemory = 0;

		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if (operationSystem != null) {
			this.operationSystem = operationSystem;
		} else {
			this.operationSystem = "Win XP";
		}
	}
}
