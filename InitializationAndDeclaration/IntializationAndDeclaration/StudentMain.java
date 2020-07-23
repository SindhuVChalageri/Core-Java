package IntializationAndDeclaration;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.name= "Guggu"; //Intialization of variable
		s1.percentage = 99.99; //Intialization of variable

		s1.read();
		s1.talk();
		s1.sleep();
		s1.read();

		System.out.println(s1.name + " is so dumb but he scored " + s1.percentage);

	}
}
