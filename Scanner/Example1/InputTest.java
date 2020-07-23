package Example1;

import java.util.Scanner;

public class InputTest {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scn.next();
		System.out.println("Hi i am "+ name);
		scn.close();
	}
}
