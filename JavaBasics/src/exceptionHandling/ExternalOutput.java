package exceptionHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutput {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\EclipseWorkspace\\s73\\Output.txt"); //Class object = new Class()
		
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Today is Monday");
		printWriter.close();
	}

}
