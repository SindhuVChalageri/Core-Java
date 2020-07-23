package ShiShira;

public class Kid {
	
	String name;

	void Play(double hrs) {
		
		System.out.println("kid plays for " + hrs + " hours");
	}

	void Read(double hrs) {
		 
		System.out.println("kid plays for " + hrs + " hours");
	}

	void Sleeps(double hrs) {
		
		System.out.println("kid plays for " + hrs + " hours");
	}

	public static void main(String[] args) {
		
		Kid k = new Kid();
		k.Play(4);
		k.Read(2);
		k.Sleeps(12);
	}
}
