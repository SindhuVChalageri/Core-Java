package Example1;

public class Card extends CashCard {
	
	int i = 20;
	String name;
	int cardNumber;
	String expiryDate;

	void swipe() {
		System.out.println("Swipe the card");
	}
}
