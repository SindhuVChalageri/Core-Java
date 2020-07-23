package Example2;

public class Child extends Parent{

	Child(){
		super();
		System.out.println("Child Empty");
	}

	Child(int i){
		super(5);
		System.out.println("Child Int");
	}

	Child(String s){
		super("Akash");
		System.out.println("Child String");
	}
	
	public static void main(String[] args) {
		new Child();
		new Child(5);
		new Child("Akash");
	}
}
