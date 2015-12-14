
public class ComputerObjects {

	public static void main(String[] args) {
		Computer laptop= new Computer();
		laptop.year=2015;
		laptop.hardDiskMemory=512;
		laptop.freeMemory=256;
		laptop.isNotebook=true;
		laptop.price=1000;
		laptop.operationSystem="Linux";
		laptop.print();
		
		laptop.operationSystem="Windows";
		laptop.print();
		System.out.println();
		Computer pc= new Computer();
		pc.year=2012;
		pc.price=500;
		pc.hardDiskMemory=1024;
		pc.freeMemory=512;
		pc.isNotebook=false;
		pc.operationSystem="Mac";
		pc.print();
		pc.useMemory(100);
		pc.print();

	}

}
