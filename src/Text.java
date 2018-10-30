import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Text {

	public static void main(String[] args) throws FileNotFoundException {
		String location = args[0];
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		 while (sc.hasNextLine()) {
		      System.out.println(sc.nextLine()); 
		  } 

	}
}

