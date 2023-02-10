import Builder.BurgerBuilder;
import Model.Burger;

public class Director {

	private BurgerBuilder builder;
	
	public Director() {
		
		
	}
	
	public void setBuilder(BurgerBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder= builder;
	}
	
	public Burger buildChicken () {
		
		builder.setBread("English Muffin").setMeat("Chicken").setCucumber(false)
		.setEgg(false).setTomato(true).setOnion(false).setLettuce(true).setPrice(28000);
		return builder.getBurger();
	}
	
	public Burger buildBigChicken () {
		
		builder.setBread("English Muffin").setMeat("Two Chicken").setCucumber(false)
		.setEgg(true).setTomato(true).setOnion(false).setLettuce(true).setPrice(40000);
		return builder.getBurger();
	}
	
	public Burger buildBeef () {
		
		builder.setBread("Beef Burger").setMeat("Ciabatta Roll").setCucumber(false)
		.setEgg(false).setTomato(true).setOnion(true).setLettuce(true).setPrice(35000);
		return builder.getBurger();
	}
	
	public Burger buildSpecial () {
		
		builder.setBread("Beef Burger").setMeat("Chicken and Beef").setCucumber(true)
		.setEgg(false).setTomato(true).setOnion(true).setLettuce(false).setPrice(50000);
		return builder.getBurger();
	}

}
