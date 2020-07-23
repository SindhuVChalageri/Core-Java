package ShiShira;

public class MobileCon {

	String model;
	long mobNumber;

	public MobileCon(String m) {
		
		this.model = m;
		System.out.println(m);
	}
	
	public MobileCon(long n) {
		
		this.mobNumber = n;
		System.out.println(n);
	}
	
	public MobileCon(String m,long n) {
		
		this.model = m;
		this.mobNumber = n;
		System.out.println(m);
		System.out.println(n);
	}
}
