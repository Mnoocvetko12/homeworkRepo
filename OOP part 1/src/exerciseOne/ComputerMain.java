package exerciseOne;

public class ComputerMain {

	public static void main(String[] args) {

		Computer desktopComputer = new Computer(2014, 899, 500, 256);
		Computer laptop = new Computer(2015, 1765, true, 1000, 400, "Linux");

		Computer peshosComputer = new Computer();
		peshosComputer.setYear(2010);
		peshosComputer.setPrice(699);
		peshosComputer.setHardDiskMemory(250);
		peshosComputer.setFreeMemory(120);
		
		Computer marasLaptop = new Computer(2013, 699, true, 750, 322, "Windows 8");
		
		System.out.println(desktopComputer + "\n");
		System.out.println(laptop + "\n"); 
				
		
		// ne mi se struva pravilno no ne mojah da go izmislq po dobre shtot ako gi sleq dvata metoda 
		// metoda comparePrice nqma da ima stoinost na vryshtane
		desktopComputer.showCompareInfo(laptop);
		peshosComputer.showCompareInfo(marasLaptop);
	
	}
}
