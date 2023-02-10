package template;

import model.IceCream;

public abstract class IceCreamTemplate {

	
	public final IceCream generateIceCream() {
		String flavour = prepare();
		IceCream ic = generateIceCream(flavour);
		System.out.println("The ice cream is ready");
		return ic;
	}
	
	protected abstract String prepare();
	
	
	protected abstract IceCream generateIceCream(String flavour);
	
}
