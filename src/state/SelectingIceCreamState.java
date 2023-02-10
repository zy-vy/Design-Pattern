package state;

import java.util.Scanner;

import model.IceCream;
import model.IceCreamMachine;

public class SelectingIceCreamState implements State{
	private IceCreamMachine machine;
	

	public SelectingIceCreamState(IceCreamMachine machine) {
		super();
		this.machine = machine;
	}
	@Override
	public void dispenseMoney() {
		System.out.println("Dispensing money");
		machine.setCurrentState(machine.getIdle());
	}

	@Override
	public void pickingIceCream() {
		Scanner scan = new Scanner(System.in);
		String type;
		do {
			System.out.println("bucket or cone? ");
			type= scan.nextLine();
		}while(!type.equals("bucket") && !type.equals("cone"));
		
		machine.setCurrentState(machine.getGenerating());
		machine.setType(type);
	}
	
	@Override
	public void turnMoney() {
		System.out.println("Can't turn money in, please pick your ice cream");
	}
	@Override
	public void generateIceCream() {
		System.out.println("please pick your ice cream before generate ice cream");
	}
	@Override
	public IceCream takeIceCream() {
		System.out.println("There's no ice cream to take");
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Selecting Ice Cream State";
	}


}
