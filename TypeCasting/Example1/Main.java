package Example1;

public class Main {

	public static void main(String[] args) {

		Vegetable v = new Carrot(); //Upcasting to vegetable class
		v.price = 500;
		v.quantity = 1;
		v.chop();
		v.wash();
		
		/*v.prepareHalwa();
		Since we have upcasted object to the vegatable class,It is not possible to access method of the subclass
		If we do upcasting then we can access implementation and variable of the super class only not the subclass
		*/
		
		Carrot c = (Carrot)v; // Downcasting object from vegetable class to carrot class
		c.prepareHalwa();
		c.chop();
		c.wash();
		//U can access methods of both super class and sub class when u downcast
	}
}
