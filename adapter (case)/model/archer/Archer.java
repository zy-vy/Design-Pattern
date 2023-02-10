package model.archer;

import model.monster.Monster;

public abstract class Archer {
	protected String name;
	protected Integer hp;
	protected Integer damage;
	protected Integer accuracy;

	public abstract void shoot(Monster monster);
	protected abstract boolean getAccuracy();

	public void decreaseHp(Integer damage) {
		hp -= damage;
	}
	
	public Integer getHp() {
		return hp;
	}
	
	public String getName() {
		return name;
	}
}
