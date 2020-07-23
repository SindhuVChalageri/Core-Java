package Example1;

public class ElectricBike extends Vehicle{

	String name ;
	int i = 50;

	void bikeDetails() {
		this.name = "Amphere 50";

		this.color = "Black";
		this.price = 50000;

		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
	}
	//both parent and child class have variable by same name at that time this keyword will display 
	//current child class variable value and super will display the parent class variable value
	void display() {

		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		
		new ElectricBike().bikeDetails();


	}
}
