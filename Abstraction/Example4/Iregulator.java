package Example4;

public interface Iregulator extends Iswitch {

	//If you don't specify the methods as abstract The jvm will implicitly consider it as abstract 
	void increase();
	void decrease();
	
}
