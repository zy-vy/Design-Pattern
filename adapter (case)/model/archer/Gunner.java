package model.archer;

import java.util.Random;

import model.monster.Monster;

public class Gunner extends Archer{

	public Gunner(String name) {
		hp = 100;
		this.name = name;
		damage = 20;
		accuracy = 90;
	}
	
	@Override
	public void shoot(Monster monster) {
		if(getAccuracy()) {
			System.out.println(name + " shots " + monster.getName() + " with " + damage + " damage ");
			monster.decreaseHp(damage);
		}else {
			System.out.println(name + " missed the shots");
		}
	}

	@Override
	protected boolean getAccuracy() {
		Random random = new Random();
		boolean result = random.nextInt(100) + 1 < 90;
		return result;
	}
}
