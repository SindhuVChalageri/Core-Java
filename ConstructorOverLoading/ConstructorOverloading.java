

public class ConstructorOverloading {

	int price;
	String color;

	public ConstructorOverloading() {
		//This is an empty constructor
	}

	ConstructorOverloading(int p, String c){

		//This is a constructor which take two parameters as its input
		this.color=c;
		this.price=p;
	}

	ConstructorOverloading(int p){

		//This is a constructor which is taking one parameter as input
		this.price=p;
	}


}
