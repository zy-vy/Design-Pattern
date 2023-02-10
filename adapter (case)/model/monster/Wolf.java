package model.monster;

import model.fighter.Fighter;

public class Wolf extends Monster{

	public Wolf() {
		hp = 80;
		name = "Wolf";
		damage = 10;
	}
	
	@Override
	public Integer bite(Fighter fighter) {
		fighter.decreaseHp(damage);
		System.out.println("Wolf attack " + fighter.getName() + " with " + damage + " dmg");
		return null;
	}
}
