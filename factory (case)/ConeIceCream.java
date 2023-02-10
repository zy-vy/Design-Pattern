package creational.topposhop;

public class ConeIceCream extends IceCream {

	private String name ="cone";
	public ConeIceCream(String flavour,String type) {
		// TODO Auto-generated constructor stub
		super(flavour,type);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		
		System.out.println(getFlavour()+" "+getType()+" cone ice cream");
	}

}
