
public class WatchUser {

	public static void main(String[] args) {

		/* We cannot create the object for the interface calss hence we are doing upcasting
		 * and creating object for the class which exteds IKey
		 */
		
		IKey i = new Watch();
		i.rotate();
		i.pullAndRotate();
		
	}
}

