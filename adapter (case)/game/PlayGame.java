package game;

import model.fighter.Fighter;
import model.monster.Monster;
import model.monster.Wolf;

public class PlayGame {
	public Fighter fighter;
	public Monster monster;
	
	public PlayGame(Fighter fighter) {
		this.fighter = fighter;
		monster = new Wolf();
	}

	// Game Logic
	public void play() {
		System.out.println("Fighting " + fighter.getName() + " vs " + monster.getName());

		while(fighter.getHp() > 0 && monster.getHp() > 0) {
			try {
				Thread.sleep(1000);

				fighter.attack(monster);
				if(monster.getHp() <= 0) {
					System.out.println(fighter.getName() + " won ...");
					break;
				}
				
				monster.bite(fighter);
				if(fighter.getHp() <= 0) {
					System.out.println(monster.getName() + " won ...");
					break;
				}
			} catch (InterruptedException e) {
			}
		}
	}
	
	
}
