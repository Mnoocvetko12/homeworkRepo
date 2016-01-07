package write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class WriteTest {

	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File("write3.txt");
		
		PrintStream writeFile = new PrintStream(file);
		
		for (int i = 1; i <= 100; i++) {
			writeFile.println("I will write 100 times how easy is that!!!");
		}

		writeFile.close();
	}

}
