package model.monster;

import model.fighter.Fighter;

public abstract class Monster {
	protected Integer hp;
	protected String name;
	protected Integer damage;
	
	public abstract Integer bite(Fighter fighter);

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
