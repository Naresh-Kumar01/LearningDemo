package day19;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptions {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Program is started..");
		System.out.println("Program is progress..");
		
		/*try 
		{
			FileInputStream file=new FileInputStream("C:\\file.txt");
		}
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		*/
		
		FileInputStream file=new FileInputStream("C:\\file.txt");
		
		System.out.println(file.read());
		

		System.out.println("Program is completed..");

	}

}
