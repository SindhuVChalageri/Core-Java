package Example1;

public class BabyDemo {

	String name,color,gender;

	//Constructor with parameters
	BabyDemo(String g, String c) {
		
		this.gender = g;
		this.color = c;
	}
	
	public static void main(String[] args) {
		
		BabyDemo b = new BabyDemo("Female", "Blue");
		System.out.println(b.gender);
		System.out.println(b.color);
	}
}
