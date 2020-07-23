package ArrayListEx_1;

import java.util.ArrayList;

public class E_Commerce {

	public static void main(String[] args) {

		Product p = new Product();
		p.setQty(1);
		p.setPrice(400);
		p.setName("Levis Jeans");

		Product p1 = new Product();
		p1.setQty(1);
		p1.setPrice(900);
		p1.setName("United colors of benton");

		Product p2 = new Product();
		p2.setQty(1);
		p2.setPrice(250);
		p2.setName("Wildstone perfume");

		ArrayList<Product> pl = new ArrayList<Product>();

		pl.add(p);
		pl.add(p1);
		pl.add(p2);

		for(Product pr : pl) {
			System.out.println(pr);
		}
		
		for(int i = 0 ; i< pl.size();i++) {
			Product prd = pl.get(i);
			System.out.println(prd);
		}
	}
}
