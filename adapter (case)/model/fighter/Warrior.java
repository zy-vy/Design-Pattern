package model.fighter;

import model.monster.Monster;

public class Warrior extends Fighter{
	
	public Warrior(String name) {
		hp = 100;
		this.name = name;
		damage = 20;
	}

	@Override
	public void attack(Monster monster) {
		System.out.println(name + " attacks " + monster.getName() + " with " + damage + " damage ");
		monster.decreaseHp(damage);
	}

	@Override
	public Integer getHp() {
		return hp;
	}
}
