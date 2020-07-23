package Example7;

public class PizzaMain {

	public static void main(String[] args) {

		Person p = new Person();
		Pizza pz = new Pizza();
		pz.falvour ="Cloud9";
		pz.size ="Large";
		pz.price = 450;
		p.eat(pz);
	}
}
