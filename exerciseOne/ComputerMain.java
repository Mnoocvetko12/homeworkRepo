package exerciseOne;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer desktopComputer = new Computer();
		Computer laptop = new Computer();
		
		desktopComputer.year = 2014;
		desktopComputer.price = 859;
		desktopComputer.isNotebook = false;
		desktopComputer.hardDiskMemory = 500;
		desktopComputer.freeMemory = 256;
		desktopComputer.operationSystem = "Windows 7";
		
		System.out.println(desktopComputer + "\n");
		
		laptop.year = 2015;
		laptop.price = 1799;
		laptop.isNotebook = true;
		laptop.hardDiskMemory = 750;
		laptop.freeMemory = 600;
		laptop.operationSystem = "Linux";
		
		System.out.println(laptop);
		
		desktopComputer.useMemory(100);
		laptop.changeOperationSystem("Windows 10");
		
		System.out.println();
		System.out.println(desktopComputer + "\n");
		
		System.out.println(laptop);
	}

}
