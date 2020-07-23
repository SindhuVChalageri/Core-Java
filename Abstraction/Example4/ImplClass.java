package Example4;

public class ImplClass implements Iregulator{

	@Override
	public void switchOn() {
		System.out.println("Switch on");
	}
	
	@Override
	public void switchOff() {
		System.out.println("Switch off");
	}
	
	@Override
	public void increase() {
		System.out.println("Increase regulator");
	}
	
	@Override
	public void decrease() {
		System.out.println("Decrease regulator");
	}
}

