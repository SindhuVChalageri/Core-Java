package InstanceOf;

public class InstanceOf {
	
	public static void main(String[] args) {
		Animal a = new Cat();
		
		if(a instanceof Animal) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(a instanceof Cat) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(a instanceof Object) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(a instanceof Rat) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
