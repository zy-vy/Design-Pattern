package creational.topposhop;

public class ConeIceFactory extends IceCreamFactory {

	public ConeIceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IceCream createIceCream(String flavour, String type) {
		// TODO Auto-generated method stub
		ConeIceCream cone = new ConeIceCream(flavour,type);
		System.out.println("prepare the cone");
		System.out.println("put the "+flavour+" ice cream flavour on top of cone");
		System.out.println("add extre waffle stick on top of the ice cream");
		System.out.println(flavour+" "+type+ " cone ice cream is ready to serve");
		History history = History.getHistory();
		history.addHistory(cone);
		return cone;
	}

}
