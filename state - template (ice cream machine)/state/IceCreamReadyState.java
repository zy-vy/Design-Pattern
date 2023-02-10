package state;

import model.IceCream;
import model.IceCreamMachine;

public class IceCreamReadyState implements State{
	private IceCreamMachine machine;
	
	
	public IceCreamReadyState(IceCreamMachine machine) {
		super();
		this.machine = machine;
	}
	@Override
	public void dispenseMoney() {
		System.out.println("please take your ice cream first");
	}

	@Override
	public void pickingIceCream() {
		System.out.println("please take your ice cream first");
		
	}
	@Override
	public void turnMoney() {
		System.out.println("please take your ice cream first");		
	}
	@Override
	public void generateIceCream() {
		System.out.println("please take your ice cream first");
	}
	
	@Override
	public IceCream takeIceCream() {
		IceCream ic = machine.getIceCream();
		machine.setCurrentState(machine.getIdle());
		machine.setIceCream(null);
		machine.setType(null);
		return ic;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ice Cream Ready to Take";
	}

}
