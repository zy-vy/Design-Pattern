package game;

import java.util.Scanner;

import model.archer.Archer;
import model.archer.ArcherToFighterAdapter;
import model.archer.Gunner;
import model.fighter.Fighter;
import model.fighter.Warrior;
import model.wizard.BlackMage;
import model.wizard.Wizard;
import model.wizard.WizardToFighterAdapter;

public class MainMenu {
	
	private Scanner scan;
	
	// 3 Type of Model
	private Fighter fighter;
	private Wizard wizard;
	private Archer archer;
	
	private void cls() {
		for (int i = 0; i < 10; i++) System.out.println();
	}
	
	public MainMenu() {
		init();

		int choose = -1;
		while(choose != 0) {
			cls();

			System.out.println("Angel Adventure");
			System.out.println("=========================");
			System.out.println(fighter.getName()+"'s (Warrior) health "+ fighter.getHp());
			System.out.println(wizard.getName()+"'s (Black mage) health "+ wizard.getHp());
			System.out.println(archer.getName()+"'s (Gunner) health "+ archer.getHp());
			System.out.println("1. Fight as Warrior");
			System.out.println("2. Fight as Black Mage");
			System.out.println("3. Fight as Gunner");
			
			System.out.println("0. Exit");
			choose = scan.nextInt();
			scan.nextLine();
			
			// Warrior
			if(choose == 1) {
				menu1();
			}
			// Mage
			else if(choose == 2) {
				menu2();
			}	
			// Archer
			else if(choose == 3) {
				menu3();
			}
		}
		
	}
	
	
	/*
	 * You are supposed to create an adapter class
	 * and modify below's code
	 * 
	 * */
	private void menu2() {
		// You are supposed to create an adapter class so the wizard is suited to play the game
		
		/// START OF EDITING
		/**
		 * - Create an adapter from wizard to fighter, 
		 * - then validate the health
		 * after that
		 * - if the wizard is still alive then play the game, otherwise show an error message.
		**/
		
		Fighter fighter = new WizardToFighterAdapter(wizard);
		
		if(validateHealth(fighter) ) {
			System.out.println("Your fighter is dead");
		}else {
			PlayGame game = new PlayGame(fighter);
			game.play();
		}
		
		// END of EDITING
		
		scan.nextLine();
	}
	
	
	
	/*
	 * You are supposed to create an adapter class
	 * and modify below's code
	 * 
	 * */
	private void menu3() {
		// You are supposed to create an adapter class so the gunner is suited to play the game
		
		/// START OF EDITING
		/**
		 * - Create an adapter from archer to fighter, 
		 * - then validate the health
		 * after that
		 * - if the archer is still alive then play the game, otherwise show an error message.
		**/
		Fighter fighter = new ArcherToFighterAdapter(archer);
		
		if (validateHealth(fighter)) {
			System.out.println("Your fighter is dead");
		}
		else {
			PlayGame game = new PlayGame(fighter);
			game.play();
		}
		
		// END of EDITING
		
		scan.nextLine();
	}
	
	
	private void menu1() {
		if(validateHealth(fighter) ) {
			System.out.println("Your fighter is dead");
		}else {
			PlayGame game = new PlayGame(fighter);
			game.play();
		}
		scan.nextLine();
	}

	// Method for Validate Health of Fighter
	private boolean validateHealth(Fighter fighter) {
		return fighter.getHp() <= 0;
	}
	
	private void init() {
		cls();

		scan = new Scanner(System.in);
		String warriorName, wizardName, archerName;

		do {
			System.out.println("Input warrior name:");
			warriorName = scan.nextLine();
		}while(warriorName.trim().length() == 0);
		
		do {
			System.out.println("Input wizard name:");
			wizardName = scan.nextLine();
		}while(wizardName.trim().length() == 0);
		
		do {
			System.out.println("Input gunner name:");
			archerName = scan.nextLine();
		}while(archerName.trim().length() == 0);
		
		fighter = new Warrior(warriorName);
		wizard = new BlackMage(wizardName);
		archer = new Gunner(archerName);
		
		System.out.println("Success created mage, fighter, and gunner");
		scan.nextLine();
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}

}
