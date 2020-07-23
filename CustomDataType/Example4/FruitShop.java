package Example4;
import java.util.Scanner;

public class FruitShop {

	/*Fruit sell(Money m){

		Fruit f = new Fruit();
		f.price = 100;
		f.fruitname= "Strawberry";
		System.out.println(f.fruitname + " price is " + f.price);
		return f;	
	}*/

	Money excessamount() 
	{
		Money m1 = new Money();
		Fruit f = new Fruit();
		f.price = 120;
		Scanner scn = new Scanner(System.in);
		System.out.println("Shokeeper says : Please say the fruit name which u need");
		String name = scn.nextLine();
		System.out.println("I need" + name);
		System.out.println("Shopkeeper says : It costs rs " + f.price + " please give it");
		System.out.println("Enter the money that u have");
		int cmoney = scn.nextInt();
		if(cmoney >= 120) {
			System.out.println("Customer says : I have " + cmoney + " Plase take and give he change");
			System.out.println("The shopkeeper took "+ cmoney);
			int remamt = cmoney - f.price;
			System.out.println("The shopkeeper gave " + name + " and returned " + remamt);
		}
		else {
			System.out.println("You don't have suffiecent money please go home");
		}
		
		scn.close();
		return m1;
	}
}
