package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Self_Check_in(Sprint-2)\\FileHandling1\\SCI.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}
}