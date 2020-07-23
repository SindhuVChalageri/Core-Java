package Rule_2;

public class Runner {

	void giveProject(Company c) {
		
		System.out.println(c);
		System.out.println("we provided project to the development team ") ;
	}
	
	public static void main(String[] args) {
		Runner r = new Runner();
		DevelopmentTeam d = new DevelopmentTeam();
		System.out.println(d);
		r.giveProject(d);
	}
}
