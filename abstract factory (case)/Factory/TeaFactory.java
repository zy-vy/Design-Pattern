package Factory;

import Model.MilkTea;
import Model.Tea;

public interface TeaFactory {
	
	Tea CreateTea();
	
	MilkTea CreateMilkTea();

}
