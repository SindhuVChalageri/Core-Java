package StaticBlocks;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("Constructor Called");
	}

	//Static blocks cannot be inheritted
	static {
		
		System.out.println("Static block of Cat");
	}

	/* When one class extends another class the super class is loaded first then the sub class will be loaded
	 * So when the object of sub class is created or constructor of the sub class is created it will first load super class
	 * When super and sub class both have static blocks the super class static block will be loaded first
	 * Hence when we create object of cat class It will first execute the animal class static block then the cat's static block  
	 */
	
	public static void main(String[] args) {
		Cat c = new Cat();
	}
	
	//Constructor is called after the Static block
}
