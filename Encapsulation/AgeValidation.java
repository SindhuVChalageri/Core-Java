
public class AgeValidation {
	
	private int age;
	
	void setAge(int age) {
		
		if(age>0 && age<120) {
			this.age = age ;
		}
		else {
			System.out.println("Inavalid age");
		}
	}
	
	int getAge() {
		return this.age;
	}

}
