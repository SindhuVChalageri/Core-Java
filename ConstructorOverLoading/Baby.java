

public class Baby {

	int age;
	String name;
	String gender;
	String color;
	String dob;

	//Constructor Overloading
	Baby(String n,String c) {
		
		this("Akash",22,"11-12-1994");
		this.name = n;
		this.color = c;
	}
	
	Baby(String n, int a,String d) {

		this.name = n;
		this.age = a;
		this.dob = d;
	}
	
	public static void main(String[] args) {
		// Baby b = new Baby(); When the Parametrized constructor is defined we need to declare the defualt constuructor manually
	}
}
