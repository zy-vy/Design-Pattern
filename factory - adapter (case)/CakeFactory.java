
public class CakeFactory {

	public CakeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Cake createCake(String name, String type, String softness, String toping, int price, String paymentMethod ) {
		
		Price price2;
		
		if (paymentMethod=="Cash") {
//			Cash cash = new Cash();
			price2 = new Price (price);
			
		}
		else if (paymentMethod == "Transfer"){
//			Transfer transfer = new Transfer();
			price2 = new Price(price);
		}
		else {
//			Crypto crypto = new Crypto();
			price2 = new Price(price);
		}
		
		
		
		return new Cake(name, type, softness, toping , price2, paymentMethod);
	}
}
