import java.util.Scanner;

public class Example_1 {

	int res;

	void divide(int i , int j) {

		//we can use 
		try {
			res = i/j;
			System.out.println(res);
		}/*catch (ArithmeticException	e) {
			System.out.println("Enter proper values");
		}*/catch (NullPointerException e) {
			System.out.println("This is null pointer exception");
		}

	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int i = s.nextInt();
		System.out.println("Enter the 2nd number");
		int j = s.nextInt();
		Example_1 e = new Example_1();
		e.divide(i, j);
		System.out.println("completed");
	}
}
