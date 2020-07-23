package HashCodeOverride;

public class StringHashCode {

	static String name;
	static int id;
	
	//This implementation is already there in the super class Object 
	//We are over riding that implentation now
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	public static void main(String[] args) {
	
		StringHashCode s = new StringHashCode();
		StringHashCode s1 = new StringHashCode();
		s.hashCode();
		
		name = "Akash";
		id = 3;
		System.out.println("Inside object class hashcode method "+s.hashCode());
		
		name = "Akash";
		id = 3;
		System.out.println("Inside object class hashcode method "+s1.hashCode());
	}
}
