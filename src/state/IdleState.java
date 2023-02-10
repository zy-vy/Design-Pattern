package state;

import model.IceCream;
import model.IceCreamMachine;

public class IdleState implements State{
	private IceCreamMachine machine;
	public IdleState(IceCreamMachine machine) {
		this.machine = machine;
	}
	@Override
	public void dispenseMoney() {
		System.out.println("The system in idle state ... ");
	}

	@Override
	public void pickingIceCream() {
		System.out.println("The system in idle state ... ");
	}
	@Override
	public void turnMoney() {
		machine.setCurrentState(machine.getSelecting());
	}
	@Override
	public void generateIceCream() {
		System.out.println("The system in idle state ... ");
	}
	@Override
	public IceCream takeIceCream() {
		System.out.println("There's no ice cream to take");
		return null;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Idle State";
	}
}
