package model.fighter;

import model.monster.Monster;

public abstract class Fighter {
	protected String name;
	protected Integer hp;
	protected Integer damage;
	
	public abstract void attack(Monster monster);

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
