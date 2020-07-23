package Example1;

public class Parent {

	Parent() {
		System.out.println("Parent 0 param");
	}

	Parent(int i){
		this();
		System.out.println("Parent 1 param(int)");
	}

}
