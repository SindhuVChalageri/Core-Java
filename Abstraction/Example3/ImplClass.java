package Example3;

import Example3.InterfaceClass;

public class ImplClass implements InterfaceClass {
	
	@Override
	public void rightClick() {
		System.out.println("Right click");
	}
	
	@Override
	public void click() {
		System.out.println("click");
	}
	
	@Override
	public void leftClick() {
		System.out.println("left click");
	}
	
	public void scroll() {
		System.out.println("Scroll");
	}
	
}
