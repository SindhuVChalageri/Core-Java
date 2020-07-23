package Equals;

public class Test {
	
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.id = 3;
		s1.name = "Akash";
		
		Student s2 = new Student();
		s2.id = 3;
		s2.name = "Abhi";
		
		s1.equals(s2);
	
	}
}
