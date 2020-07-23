package MultippleMethodsInOneClass;

public class MultipleMethods {
	
	void wash() {
		System.out.println("I washed my hands");
	}
	
	void eat() {
		System.out.println("I eat my food");
		this.wash();
		this.walk();
		this.read();
	}

	void read() {
		System.out.println("I read my book");
	}
	
	void walk() {
		System.out.println("I walk");
	}
	
	public static void main(String[] args) {
		MultipleMethods m = new MultipleMethods();
		m.eat();
	}
}
