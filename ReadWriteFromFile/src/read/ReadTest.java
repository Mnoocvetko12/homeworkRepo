package read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTest {

	public static void main(String[] args) {
		File file = new File("write3.txt");
		Scanner readFile = null;
		try {
			readFile = new Scanner(file);
			int countLine = 0;
			while (readFile.hasNextLine()) {
			if (countLine % 2 == 0) {
				readFile.nextLine();
				countLine++;
				
			} else {

					System.out.println(countLine + ". " + readFile.nextLine());
					countLine++;
				}

			}

		} catch (NullPointerException e) {
			System.out.println("File not found!");

		} catch (FileNotFoundException e) {
			System.out.println("File is empty!");
		} finally {
			if (readFile != null) {
				readFile.close();
			}
		}
		System.out.println("Read file close!");
	}

}
