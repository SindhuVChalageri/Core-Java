package Example2;

import java.util.Scanner;

public class Caluclator {

	double multiply() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the first digit to be muliplied");
		double d1 = scn.nextDouble();
		
		System.out.println("Enter the second digit to be muliplied");
		double d2 = scn.nextDouble();
		
		double res = d1*d2;
		
		scn.close();
		return res;
	}
	
	public static void main(String[] args) {
		Caluclator c = new Caluclator();
		double res = c.multiply();
		System.out.println(res);
	}

}
