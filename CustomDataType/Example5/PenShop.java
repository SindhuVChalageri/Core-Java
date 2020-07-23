package Example5;

public class PenShop {

	void sell(Pen p){
		
		p.price = 5;
		p.color = "Black";
		System.out.println("I AM SELLING " + p.color + " PEN AT PRICE OF " + p.price);
	}
}
