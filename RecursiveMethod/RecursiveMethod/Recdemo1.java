package RecursiveMethod;

public class Recdemo1 {

	void drink() {
		System.out.println("I am drinking");
		drink();
	}

	public static void main(String[] args) {
		new Recdemo1().drink();
	}
}
