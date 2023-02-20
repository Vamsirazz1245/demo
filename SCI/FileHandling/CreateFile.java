package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Self_Check_in(Sprint-2)\\FileHandling1\\SCI.txt");
		try {
			if(myObj.createNewFile()) {
				System.out.println("File Created " + myObj.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();	
		}
	}
}