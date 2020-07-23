package Example3;

import Example3.InterfaceClass;

public class Runner {

	public static void main(String[] args) {

		InterfaceClass i = new ImplClass();
		i.rightClick();
		i.click();
		i.leftClick();
		
		
		// To use the method inside the sub class we need to downcast the object of superclass to subclass
		ImplClass c = (ImplClass) i ;
		c.scroll();
	}
}
