package LateBinding_1;

public class Vegetables {
	
	static final ChoopedPeice ChoopedPeice = null;

	//We can have interface as the method return type
	//return type is not custom data type it is an interface
	ChoopedPeice chop() {
		
		System.out.println("Vegtables chopped");
		return ChoopedPeice;
	}
}
