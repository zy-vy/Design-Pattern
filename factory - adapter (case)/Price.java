
public class Price {
	
	private int num;

	public Price(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	
	public double calculatePrice(Cash cash) {
		
		double price = cash.getRate() * (double) this.num;
		
		return price ;
		
	}

}
