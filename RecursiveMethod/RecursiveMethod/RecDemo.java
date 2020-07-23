package RecursiveMethod;

public class RecDemo {

	void openDoor() {
		System.out.println("Opens the door");
		closeDoor();
	}
	
	void closeDoor() {
		System.out.println("Close the door");
		openDoor();
	}
	
	public static void main(String[] args) {
		RecDemo r = new RecDemo();
		r.openDoor();
	}
}
