package Equals;

public class Student {

	int id = 3;
	String name = "akash";
	
	@Override
	public boolean equals(Object obj) {
		
		boolean res = false;
		
		// Checking weather the student extends object or not 
		if(obj instanceof Student) {
			
			System.out.println("Downcasting refference class Object to sub class");
			Student s = (Student)obj;
			//Comparing the values
			if(this.id ==  s.id && this.name.equals(s.name)) {
				res = true;
			}else {
				res = false;
			}
		}
		System.out.println(res);
		return res;
	}
}
