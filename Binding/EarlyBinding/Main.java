package EarlyBinding;

public class Main {

	/* Early binding happens when methods are overloaded
	 * When we try to call the overloaded methods it will show us the options which overloaded method you need
	 * Which method should be called is decided during the time of calling only, Hence this is called as early binding 
	 * This is also called as runtime polymorphism or static binding
	 */
	
	public static void main(String[] args) {
		
		LoginValidation l = new LoginValidation();
		l.validate("Akash", "Secret");
	}
}
