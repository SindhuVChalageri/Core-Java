package LateBinding_2;

public class Resumes extends Naukri{
	
	@Override
	void searchProfiles() {
		System.out.println("Inside Resume class");
		super.searchProfiles();
	}

}
