
public class Watch implements IKey {
	
	@Override
	public void rotate() {
		System.out.println("I am rotating the to change hours");	
	}
	
	@Override
	public void pullAndRotate() {
		System.out.println("I am rotating to change minutes");
	}

}
