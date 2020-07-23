package Example4;

public class Runner {

	public static void main(String[] args) {
	
	/* Upcasting is done for the Iregulator class instead of Iswitch interface this is because
	 * Iregulator extends all the Iswitch it means all abstract method inside Iswitch will be inherited to I regulator
	 * If we do upcasting for Iswitch we can access only abstract method inside the Iswitch
	 * But if we do upcasting for Iregulator we can access al the methods inside Iregulator as well Iswitch
	 * Because Iregulator extends Iswitch
	 */
		
	Iregulator ir = new ImplClass();		
	ir.switchOn();
	ir.switchOff();
	ir.increase();
	ir.decrease();
	
	}
}
