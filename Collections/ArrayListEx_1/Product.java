package ArrayListEx_1;

public class Product {

	private int qty;
	private double price;
	private String name;
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String msg = "You are buying "+this.getName()+" for price "+ this.getPrice();
		return msg;
	}
	
}
