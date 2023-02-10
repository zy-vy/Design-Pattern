package main;

import java.util.Scanner;

import model.IceCream;
import model.IceCreamMachine;

public class Main {
	public Scanner scan;
	IceCreamMachine machine;
	public Main() {
		machine = new IceCreamMachine();
		int choose = -1;
		scan = new Scanner(System.in);
		
		do {
			System.out.println("Current State: "+machine.getCurrentState());
			System.out.println("1. Insert Money to Vending");
			System.out.println("2. Picking ice cream");
			System.out.println("3. Generate ice cream");
			System.out.println("4. Take the ice cream");
			System.out.println("0. Exit");
			System.out.print(">> ");
			choose = scan.nextInt();
			scan.nextLine();
			switch(choose) {
				case 1:
					machine.insertMoney();
					break;
				case 2:
					
					machine.choosingIceCream();
					break;
				case 3:
					machine.generateIceCream();
					break;
				case 4:
					IceCream ic = machine.takeIceCream();
					if(ic != null) {
						System.out.println("Name: "+ic.getName());
						System.out.println("Flavor: "+ic.getFlavour());
						System.out.println("Type: "+ic.getType());
					}
					break;
			}
			
			
		}while(choose != 0);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
