package factory;

import java.util.List;

import model.Cake;
import model.Cash;
import model.CashToPaymentAdapter;
import model.Crypto;
import model.CryptoToPaymentAdapter;
import model.Payment;
import model.Transfer;
import model.TransferToPaymentAdapter;

public class CakeFactory {
	

	public CakeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Cake createCake(String type, String name, String softness, List<String> topping, int price, String payment) {
		
		Payment pay = new Payment();
		if (payment.equals("Cash")) {
			Cash cash = new Cash(price);
			pay = new CashToPaymentAdapter(cash);
		}
		else if (payment.equals("Transfer")) {
			Transfer transfer = new Transfer(price);
			pay = new TransferToPaymentAdapter(transfer);
		}
		else if (payment.equals("Crypto"))
		{
			Crypto crypto = new Crypto(price);
			pay = new CryptoToPaymentAdapter(crypto);
		}
		
//		pay.setType(payment);
		return new Cake(type, name, softness, topping, price, pay);
		
		
	}

}
