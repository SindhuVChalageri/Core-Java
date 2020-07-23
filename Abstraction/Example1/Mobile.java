package Example1;

public abstract class Mobile {

	String model;
	
	//Abstract class can have constructors
	public Mobile() {
	}
	
	//Abstract class can also have overloaded constructors
	public Mobile(String m) {
		this.model = m;
	}

	public abstract void middleButton();//This is an abstract method
	//Abstract method can have input parameters
	//Abstract method can also be overloaded
	public abstract void add(int i , double d);
	
	//These are concrete methods
	public void pressq() {

		System.out.println("This is concrete method1 : Q is printer");
	}
	
	public void sendSms() {

		System.out.println("This is concerete method2 : Sms sent");
	}
}
