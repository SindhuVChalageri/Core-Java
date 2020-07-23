package Example5;

public interface Inter {

	//We can declare the concrete method inside the interface but the method should be declared as default or static  
	//If we don't declare the method inside a interface as default or static then we will get error

	default void method1() {
	}

	static void method2() {

	}
}
