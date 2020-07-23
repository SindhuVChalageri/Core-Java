package Example1;

public class Test {

	public static void main(String[] args) {
		
	CreditCard c = new CreditCard();
	c.creditLimit = 50000;//Subclass specific
	
	c.cardNumber = 123456;//Inherited variable
	c.name = "Akash";
	c.swipe();
	
	c.withDrawMoney();//Inherited method
	
	new DebitCard().display();
	
	}
}
