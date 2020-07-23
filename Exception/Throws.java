import java.io.IOException;

public class Throws {

	/* "throws" is a keyword to indicate the caller that this particular method might have an exception
	 * So that the one who is calling that method will be awared that this method may have the exceptions
	 * And he will also use try and catch block to call that method*/
	
	void mehtod() throws ArithmeticException,NullPointerException,IOException{
		System.out.println("This mehtod may give the exception");
	}
	
	public static void main(String[] args) {
		Throws t = new Throws();
		
		/* When you are trying to call the methods which are havng the exception those methods has to
		 * encoded within the try and catch block
		 */
		
		try {
			t.mehtod();
		} catch (ArithmeticException | NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
}
