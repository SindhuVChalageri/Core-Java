package Example3;

public class ToStringOverRiding {

	@Override
	public String toString() {		
		return "This class created by Akash";
	}
	public static void main(String[] args) {
		ToStringOverRiding t = new ToStringOverRiding();
		//When u try to display the address object then you will not get the adress instead u will get the meaningful message
		System.out.println(t);
	}
}
