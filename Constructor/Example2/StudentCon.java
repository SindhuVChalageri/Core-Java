package Example2;

public class StudentCon {

	int yop;
	String name;
	
	public StudentCon() {
		System.out.println("No input parameters");
	}
	
	public StudentCon(int y) {
		this.yop = y;
		System.out.println("Input parameter is year of passout that is "+ y);
	}
	
	public StudentCon(String n) {
		System.out.println("Input parameter is name of student that is "+ n);
	}
	
	public StudentCon(int y,String n) {
		System.out.println("Input parameter is year of passout is "+ y + "and name of student that is " + n);
	}
}
