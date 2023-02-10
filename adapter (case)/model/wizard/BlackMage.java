package model.wizard;

import model.monster.Monster;

public class BlackMage extends Wizard{
	
	public BlackMage(String name) {
		hp = 100;
		this.name = name;
		mana = 100;
		damage = 40;
	}
	
	@Override
	public void chargeMana() {
		System.out.println(name + " is charging mana");
		mana += 10;
	}

	@Override
	public void spellAttack(Monster monster) {
		if(mana < 10) {
			System.out.println("Not enough mana, please charge your mana first..");
			return;
		}
		mana -= 10;
		monster.decreaseHp(damage);
		System.out.println(name + " case fire to " + monster.getName() + " with " + damage + " damage ");
	}
}
