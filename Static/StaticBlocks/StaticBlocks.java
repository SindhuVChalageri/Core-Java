package StaticBlocks;

public class StaticBlocks {

	//Static blocks are executed before the main method
	//Static blocks are executed at the time of class loading
	
	static {
		System.out.println("Static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		new Cat();
	}
	
	static {
		System.out.println("Static block 2");
	}
}
