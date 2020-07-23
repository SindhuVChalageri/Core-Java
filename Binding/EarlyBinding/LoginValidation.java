package EarlyBinding;

public class LoginValidation {

	boolean validate(String us, String pwd) {
		
		System.out.println("Name :" +us+ " Password is "+pwd);
		return false;
	}
	
	//Method overloaded with different parameters
	boolean validate(long num,int otp) {
		
		return false;
	}
}