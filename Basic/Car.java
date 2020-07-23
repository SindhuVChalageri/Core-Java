
public class Car {
	
	String color;
	String Brand;
	long cost;

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();

		c1.color="red";
		c2.color="green";
		c3.color="blue";
		c4.color="orange";

		System.out.println(c1.color + " " + c2.color + " " + c3.color + " " + c4.color);
		System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
		
		System.out.println(c1.cost);
	}
}
