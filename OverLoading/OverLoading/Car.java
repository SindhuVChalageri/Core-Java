package OverLoading;

public class Car {
	
	String brand;
	String model;
	
	@Override
	public String toString() {
		return this.brand + " car " +this.model;
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.model="XF";
		c.brand = "Jagur";
		System.out.println(c);
	}

}
