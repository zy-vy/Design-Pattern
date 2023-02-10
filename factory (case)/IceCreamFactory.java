package creational.topposhop;

public abstract class IceCreamFactory {
	


	public IceCream serveIceCream(String flavour, String type) {
		// TODO Auto-generated constructor stub
		IceCream ice = createIceCream(flavour,type);
		return ice;
	}
	
	protected abstract IceCream createIceCream(String flavour, String type);
	
}
