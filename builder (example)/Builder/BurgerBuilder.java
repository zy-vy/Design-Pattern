package Builder;

import Model.Burger;

public interface  BurgerBuilder {
	
	BurgerBuilder setBread(String name);
	
	BurgerBuilder setMeat(String name);
	
	BurgerBuilder setCucumber(Boolean bool);
	
	BurgerBuilder setEgg(Boolean bool);
	
	BurgerBuilder setTomato(Boolean bool);
	
	BurgerBuilder setOnion(Boolean bool);
	
	BurgerBuilder setLettuce(Boolean bool);
	
	BurgerBuilder setPrice (Integer price);
	
	Burger getBurger ();
	

}
