package Builder;

import Model.BigChickenBurger;
import Model.Burger;

public class BigChickenBuilder implements BurgerBuilder {
	
	private BigChickenBurger burger;

	public BigChickenBuilder() {
		// TODO Auto-generated constructor stub
		this.burger = new BigChickenBurger();
	}
	
	@Override
	public BurgerBuilder setBread(String name) {
		// TODO Auto-generated method stub
		this.burger.setBread(name);
		return this;
	}

	@Override
	public BurgerBuilder setMeat(String name) {
		// TODO Auto-generated method stub
		this.burger.setMeat(name);
		return this;
	}

	@Override
	public BurgerBuilder setCucumber(Boolean bool) {
		// TODO Auto-generated method stub
		this.burger.setHasCucumber(bool);
		return this;
	}

	@Override
	public BurgerBuilder setEgg(Boolean bool) {
		// TODO Auto-generated method stub
		this.burger.setHasEgg(bool);
		return this;
	}

	@Override
	public BurgerBuilder setTomato(Boolean bool) {
		// TODO Auto-generated method stub
		this.burger.setHasTomato(bool);
		return this;
	}

	@Override
	public BurgerBuilder setOnion(Boolean bool) {
		// TODO Auto-generated method stub
		this.burger.setHasOnion(bool);
		return this;
	}

	@Override
	public BurgerBuilder setLettuce(Boolean bool) {
		// TODO Auto-generated method stub
		this.burger.setHasLettuce(bool);
		return this;
	}

	@Override
	public BurgerBuilder setPrice(Integer price) {
		// TODO Auto-generated method stub
		this.burger.setPrice(price);
		return this;
	}

	@Override
	public Burger getBurger() {
		// TODO Auto-generated method stub
		return this.burger;
	}

}
