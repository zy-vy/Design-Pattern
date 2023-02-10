package Factory;

import Model.MilkTea;
import Model.Tea;

public class TopFactory implements TeaFactory {

	public TopFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tea CreateTea() {
		// TODO Auto-generated method stub
		return new Tea("Green Leaf");
	}

	@Override
	public MilkTea CreateMilkTea() {
		// TODO Auto-generated method stub
		return new MilkTea("Green Leaf","Soy Milk");
	}

}
