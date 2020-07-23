
public class CountNumberOfObjects {

	//If we intialize totalobj to any other values then it will start increment from that value 
	static int totalObj;
	
	public CountNumberOfObjects() {
		
		this.totalObj = ++totalObj;	
	}
	
	public static void main(String[] args) {
		
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		new CountNumberOfObjects();
		System.out.println("Total number of object inside this class :" +totalObj );
		
	}
}
