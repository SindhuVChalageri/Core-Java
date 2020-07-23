
public class Mobile {

	String model;
	String price;
	final String MAKE = "INDIA";

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.model = "I Phone 7";
		m1.price = "700 $";

		Mobile m2 = new Mobile();
		m2.model = "Samsung";
		m2.price = "Rs,48000";
		
		Mobile m3 = new Mobile();
		m3.model = "Redmi";
		m3.price = "USD 250 $";

		System.out.println(m1.model+" - "+ m1.price);
		System.out.println(m2.model+" - "+ m2.price);
		System.out.println(m3.model+" - "+ m3.price);
	}
}
