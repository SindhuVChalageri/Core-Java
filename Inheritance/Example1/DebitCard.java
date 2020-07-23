package Example1;

public class DebitCard extends Card {

	int i = 30;
	
	void display() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
