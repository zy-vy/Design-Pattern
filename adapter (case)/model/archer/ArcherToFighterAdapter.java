package model.archer;

import model.fighter.Fighter;
import model.monster.Monster;

public class ArcherToFighterAdapter extends  Fighter {

	private Archer archer;
	
	public ArcherToFighterAdapter(Archer archer) {
		
		this.archer = archer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Monster monster) {
		// TODO Auto-generated method stub
		archer.shoot(monster);
	}

	public void decreaseHp(Integer damage) {
		archer.hp -= damage;
	}
	
	public Integer getHp() {
		return archer.hp;
	}

	public String getName() {
		return archer.name;
	}
}
