import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			FileReader f = new FileReader("C:\\AKASH\\Jspiders\\Eclipse oxygen 32\\workspace\\ShiShira\\Exception\\news");
			int s = f.read();
			System.out.println(s);

		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			FileWriter f = new FileWriter("C:\\AKASH\\Jspiders\\Eclipse oxygen 32\\workspace\\ShiShira\\Exception\\news");
			f.append("Ok Akash thanks for the information");

		} catch (Exception e) {

		}
	}
}
