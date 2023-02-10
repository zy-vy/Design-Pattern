package model.wizard;

import model.fighter.Fighter;
import model.monster.Monster;

public class WizardToFighterAdapter extends Fighter {

	private Wizard wizard;
	
	public WizardToFighterAdapter(Wizard wizard) {
		// TODO Auto-generated constructor stub
		this.wizard = wizard;
	}

	@Override
	public void attack(Monster monster) {
		// TODO Auto-generated method stub
		wizard.spellAttack(monster);
	}
	
	public void decreaseHp(Integer damage) {
		wizard.hp -= damage;
	}
	
	public Integer getHp() {
		return wizard.hp;
	}

	public String getName() {
		return wizard.name;
	}

}
