package LateBinding_2;

public class Main {

	/*
	 * This should execute the searchProfiles() method inside Naukri class 
	 * but it will execute the searchProfiles() method inside the Resumes
	 * This is called as Late Binding or dynamic binding
	 * The overridden methods insdide sub class will be executed
	 */
	
	public static void main(String[] args) {
		Naukri n = new Resumes();
		n.searchProfiles();
	}
}
