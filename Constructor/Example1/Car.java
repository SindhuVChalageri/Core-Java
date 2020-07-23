package Example1;

public class Car {

	String model;
	String color;

	//Constructor with parameters
	Car(String m,String c){
		this.model = m;
		this.color = c;
	}

	public static void main(String[] args) {
		
		Car c = new Car("Jagur", "Black");
		System.out.println(c.model);
		System.out.println(c.color);
	}
}
