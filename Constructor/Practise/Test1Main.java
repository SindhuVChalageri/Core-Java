package Practise;

public class Test1Main {

	public static void main(String[] args) {
		
		/* This cannot br possible because you have created a new constructor which takes the input parameters 
		 * Test1 t = new Test1();
		 * If we don't create any constructor for an class it will be having the default constructor 
		 * If we explicitly create any constructor which takes input parameters , then we cannot create an object 
		 * for that particular class by using the default constructor we need to call the constructor 
		 * which we created which accepts the input parameters 
		 */
		Test1 t = new Test1(5);
		
	}
}
