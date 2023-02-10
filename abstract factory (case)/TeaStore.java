import Factory.TeaFactory;
import Model.MilkTea;
import Model.Tea;

public class TeaStore {
	
	private TeaFactory factory ;

	public TeaStore(TeaFactory factory) {
		this.factory = factory;
	}

	public void BrewTea() {
		Tea tea = factory.CreateTea();
		System.out.println("Steep the "+tea.getLeaf()+" about a minute");
		System.out.println("Strain the "+tea.getLeaf()+"(s)");
		System.out.println("The tea is ready");
	}
	
	public void  BrewMilkTea() {
		
		MilkTea tea = factory.CreateMilkTea();
		System.out.println("Steep the "+tea.getLeaf()+" about a minute");
		System.out.println("Strain the "+tea.getLeaf()+"(s)");
		System.out.println("Add some "+tea.getMilk());
		System.out.println("The tea is ready");
	}

}
