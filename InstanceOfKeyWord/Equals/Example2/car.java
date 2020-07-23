package Equals.Example2;

public class car {

	String model;
	int regNumber;

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(obj instanceof car) {
			car c = (car)obj;
			System.out.println("Downcasting refference class object to sub class");
			if(this.model.equals(c.model)) {
				System.out.println(this.model);
				System.out.println("name matches");
				res = true;
			}
			else {
				System.out.println(this.model);
				System.out.println("name did not match ");
			}
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		car c1 = new car();
		car c2 = new car();

		c1.model = "Akash";
		c1.regNumber = 577004;

		c2.model = "Abhi";
		c2.regNumber = 577004;

		c1.equals(c2);
	}
}

