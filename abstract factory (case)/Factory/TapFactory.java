package Factory;

import Model.MilkTea;
import Model.Tea;

public class TapFactory implements TeaFactory{

	public TapFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tea CreateTea() {
		// TODO Auto-generated method stub
		return new Tea("Black Leaf");
	}

	@Override
	public MilkTea CreateMilkTea() {
		// TODO Auto-generated method stub
		return new MilkTea("Black Leaf","Full Cream Milk");
	}

}
