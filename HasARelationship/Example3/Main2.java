package Example3;

public class Main2 {

	public static void main(String[] args) {
		
		City c = new City();
		c.cityName = "Bengaluru";
		c.i = new Institution();
		c.i.instituteName = "Jspiders";
		c.i.address = "BTM Layout";
		c.i.s = new Student();
		c.i.s.stuName = "Akash";
		c.i.s.mobNum = "8553809273";
		System.out.println(c.cityName);
		System.out.println(c.i.instituteName);
		System.out.println(c.i.address);
		System.out.println(c.i.s.stuName);
		System.out.println(c.i.s.mobNum);
		
	}
}
