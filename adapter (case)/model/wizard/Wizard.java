package model.wizard;

import model.monster.Monster;

public abstract class Wizard {
	protected String name;
	protected Integer hp;
	protected Integer damage;
	protected Integer mana;

	public abstract void chargeMana();
	public abstract void spellAttack(Monster monster);
	
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
