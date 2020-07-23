package InstanceBlock;

public class Tree {

	double ht;
	{
		ht = 40.5;
		System.out.println("block 1");
	}
	{
		System.out.println("block 2");
	}
	
	public static void main(String[] args) {
		
		Tree t = new Tree();
		System.out.println(t.ht);

	}

}
