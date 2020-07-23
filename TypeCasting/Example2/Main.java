package Example2;

public class Main {

	public static void main(String[] args) {
		
		Father f = new Son();
		f.playCricket();// Method over ridden hence we are getting the output from the son class
		//f.yoga(); we will get error because yoga is not overridden method inorder get this method we need to downcast
	}
}
