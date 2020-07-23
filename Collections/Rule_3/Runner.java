package Rule_3;

public class Runner {

	/* When an methods() return type is interface class or an abstreact class 
	 * then the return type must be the object of sub class
	 */
	ICompany bussiness() {
		
		ImplEmployee ie = new ImplEmployee();
		return ie;
	}
	
	public static void main(String[] args) {
		
	}
}
