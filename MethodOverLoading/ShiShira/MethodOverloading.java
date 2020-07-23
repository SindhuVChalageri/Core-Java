package ShiShira;

public class MethodOverloading {

	void add() {
		int i=0,k=0;
		System.out.println(i+k);
	}

	void add(int i,int k) {
		System.out.println(i+k);
	}

	void add(int i,int k, int j) {
		System.out.println(i+j+k);
	}
	
	/*This is will throw error because we check only the method name and the type of input parameter or signature we are giving 
	int add(){
	int i,k;
	System.out.println(i+k);
	}*/
	
	void add(double i,int k) {
		System.out.println(i+k);
	}
}
