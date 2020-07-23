
public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "Akash";
		Student.intsName = "Qspiders";

		if (Student.intsName.equals("Qspiders"))
			System.out.println(s.name + " belongs to the " + Student.intsName + " institution");
	}
}
