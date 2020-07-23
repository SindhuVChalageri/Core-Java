
public class DrivingLicense {
	
	String name;
	int age=18;
	final String COUNTRY = "INDIA";

	public static void main(String[] args) {

		DrivingLicense d1 = new DrivingLicense();
		DrivingLicense d2 = new DrivingLicense();
		System.out.println(d1.age);
		//d2.COUNTRY = "JAPAN"; Throws error because it is set as constant 
		d1.age=23;
		System.out.println(d1.age);// Now default value is changed to 23
		System.out.println(d2.age);// d2's age is not changed becuase we intalized value for d1 not d2
	}
}
