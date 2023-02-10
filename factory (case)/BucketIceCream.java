package creational.topposhop;

public class BucketIceCream extends IceCream{
	
	private String name = "bucket";
	public BucketIceCream(String flavour,String type) {
		// TODO Auto-generated constructor stub
		super(flavour,type);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		System.out.println(getFlavour()+" "+getType()+" bucket ice cream");

	}

}
