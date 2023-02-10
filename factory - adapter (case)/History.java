import java.util.ArrayList;
import java.util.List;

public class History {
	
	private List<Cake> cakeList;
	private static History history = null;

	private History() {
		// TODO Auto-generated constructor stub
		cakeList = new ArrayList<>();
	}
	
	public static History getInstance () {
		
		if(history==null) {
			synchronized (History.class) {
				if (history == null) {
					history = new History();
				}
			}
		}
			
		
		return history;
	}
	
	public void addHistory(Cake cake) {
		cakeList.add(cake);
	}
	
	public void printHistory() {
		
		for (Cake cake : cakeList) {
			System.out.println("name 		: "+cake.getName());
			System.out.println("softness	: "+ cake.getSoftness());
			System.out.println("topping		: "+cake.getToping());
			System.out.println("payment type	: "+ cake.getPaymentMethod());
			if (cake.getPaymentMethod().equals("Cash")) {
				Cash cash = new Cash();
				System.out.println("price		: "+ cake.getPrice().calculatePrice(cash));
			}
			else if (cake.getPaymentMethod().equals("Transfer")) {
				Transfer transfer = new Transfer();
				TransferToCashAdapter adapter = new TransferToCashAdapter(transfer);
				System.out.println("price		: "+ cake.getPrice().calculatePrice(adapter));
			}
			else if (cake.getPaymentMethod().equals("Crypto")) {
				Crypto crypto = new Crypto();
				CryptoToCashAdapter adapter = new CryptoToCashAdapter(crypto);
				System.out.println("price		: "+ cake.getPrice().calculatePrice(adapter));
			}
			
			System.out.println("====================");
		}
	}
	
	

}
