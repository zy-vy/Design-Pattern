package state;

import model.IceCream;
import model.IceCreamMachine;
import template.IceCreamBucket;
import template.IceCreamCone;

public class GenerateIceCreamState implements State{

	private IceCreamMachine machine;
	private IceCreamBucket iceCreamBucket;
	private IceCreamCone iceCreamCone;
	
	
	public GenerateIceCreamState(IceCreamMachine machine) {
		super();
		this.machine = machine;
		iceCreamBucket = new IceCreamBucket();
		iceCreamCone = new IceCreamCone();
	}

	@Override
	public void dispenseMoney() {
		System.out.println("Dispense your money, return to idle state");
		machine.setCurrentState(machine.getIdle());
	}

	@Override
	public void pickingIceCream() {
		System.out.println("You already selected your ice cream, can't select anymore");
	}

	@Override
	public void turnMoney() {
		System.out.println("Can't turn money in, please generate your ice cream");
	}

	@Override
	public void generateIceCream() {
		if(machine.getType().equals("cone")) {
			machine.setIceCream(iceCreamCone.generateIceCream());
		}else if(machine.getType().equals("bucket")) {
			machine.setIceCream(iceCreamBucket.generateIceCream());
		}
		machine.setCurrentState(machine.getReady());
	}

	@Override
	public IceCream takeIceCream() {
		System.out.println("There's no ice cream to take");
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Generate Ice Cream State";
	}

}
