package Rule_1;

public class Runner {

	//return tye of a method can be the sub class object
	Institution mehtod() {
		Students s = new Students();
		return s;
	}
	
	public static void main(String[] args) {
		new Runner().mehtod();
		
	}
	
}
