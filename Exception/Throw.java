import java.io.IOException;

public class Throw {

	void mehtod() throws ArithmeticException{
		
		System.out.println("This mehtod may give the exception");
		int i = 10/0;
		System.out.println(i);
	}
	
	public static void main(String[] args) throws IOException {
		
		Throw t = new Throw();
		
		try {
			t.mehtod();
		} catch (NullPointerException | ArithmeticException  e) {
			System.out.println("Exception occured");
		}	
	}
}
