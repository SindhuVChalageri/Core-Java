package Example2;

public class Main1 {

	public static void main(String[] args) {
		
		Car1 c = new Car1();
		c.color = "Red";
		c.name = "Vitara Breeza" ;
		c.w = new Wheel1();
		c.w.amt = 5000;
		c.w.type = "MRF";
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.w.amt);
		System.out.println(c.w.type);
	}
}
