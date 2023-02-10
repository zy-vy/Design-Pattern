package model;

public class CryptoToPaymentAdapter extends Payment {
	
	private Crypto crypto;

	public CryptoToPaymentAdapter(Crypto crypto) {
		// TODO Auto-generated constructor stub
		this.crypto = crypto;
	}
	
	@Override
	public void printDetail() {
//		System.out.println("$"+transfer.getPrice()+" with account number : "+transfer.getAccount());
		System.out.printf("$%.1f",crypto.getPrice());
		System.out.println(" with address : "+crypto.getAddress());
	}
	
	@Override
	public double getPrice() {
		return crypto.getPrice();
	}

	@Override
	public void setPrice(double price) {
		crypto.setPrice((int)price);;
	}
	
	@Override
	public String getType() {
		return crypto.getType();
	}

	@Override
	public void setType(String type) {
		crypto.setType(type);;
	}

}
