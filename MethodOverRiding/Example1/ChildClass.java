package Example1;

public class ChildClass extends ParentClass{
	
	@Override
	void display() {

		System.out.println("Child display");
	}

	//Overloading the method with different parameters
	void display1(String s) {

		System.out.println("Overloading menthod by giving different parameters");
	}

	@Override
	void display2(boolean b) {

		System.out.println("Child method this is boolean");
	}
	
	/*This will throw error because the method name and parameters are same but return type is different
	boolean display2(boolean b) {
		System.out.println("");
		return boolean;
	}*/

	public static void main(String[] args) {
		
		new ChildClass().display();
		new ParentClass().display();
		new ChildClass().display1("Akash");
		new ParentClass().display2(false);
		new ChildClass().display2(false);
	}
}
