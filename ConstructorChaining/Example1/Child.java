package Example1;

public class Child extends Parent{
	
	/*We can call the zero param constructor(default constructor) of the same class by using this() keyword
	We can the call the default constructor of the super class by using super() keyword*/
	
	Child() {
		super(3);//Instead of calling the default zero param it will call 1 param constructor which is having int
		System.out.println("Child 0 param");
	}

	Child(boolean b){
		this();//Chain to same class constructor
		System.out.println("Child 1 param(boolean)");
	}
}
