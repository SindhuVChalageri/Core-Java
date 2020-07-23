package Example5;

public class Officeboy {
	
	Pen buyPen(){
		
		 PenShop ps = new PenShop();
		 Pen p = new Pen();
		 ps.sell(p);
		 System.out.println("The office boy took pen from shop");
		 return p;
	}
}
