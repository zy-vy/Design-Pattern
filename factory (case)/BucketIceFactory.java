package creational.topposhop;

public class BucketIceFactory extends IceCreamFactory{

	public BucketIceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IceCream createIceCream(String flavour, String type) {
		// TODO Auto-generated method stub
		BucketIceCream bucket = new BucketIceCream(flavour,type);
		System.out.println("prepare a bucket");
		System.out.println(flavour+" "+type+" bucket ice cream is ready to serve");
		History history = History.getHistory();
		history.addHistory(bucket);
		return bucket;
	}

}
