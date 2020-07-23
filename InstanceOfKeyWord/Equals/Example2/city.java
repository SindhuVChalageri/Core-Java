package Equals.Example2;

public class city {

	String name;
	int pincode;

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(obj instanceof city) {
			city c = (city)obj;
			System.out.println("Downcasting refference class object to sub class");
			if(this.name.equals(c.name)) {
				System.out.println(this.name);
				System.out.println("name matches");
				res = true;
			}
			else {
				System.out.println(this.name);
				System.out.println("name did not match ");
			}
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		city c1 = new city();
		city c2 = new city();

		c1.name = "Akash";
		c1.pincode = 577004;

		c2.name = "Abhi";
		c2.pincode = 577004;

		c1.equals(c2);
	}
}
