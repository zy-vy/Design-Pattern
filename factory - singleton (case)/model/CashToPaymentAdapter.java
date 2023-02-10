package model;

public class CashToPaymentAdapter extends Payment{

	
	private Cash cash;
	
	public CashToPaymentAdapter() {
		// TODO Auto-generated constructor stub
	}

	public CashToPaymentAdapter(Cash cash) {
		this.cash = cash;
	}
	
	
	@Override
	public void printDetail() {
//		System.out.println("$"+this.cash.getPrice());
		System.out.printf("$%d.0",cash.getPrice());
		System.out.println();

	}
	
	@Override
	public double getPrice() {
		return cash.getPrice();
	}

	@Override
	public void setPrice(double price) {
		cash.setPrice((int)price);;
	}
	
	@Override
	public String getType() {
		return cash.getType();
	}

	@Override
	public void setType(String type) {
		cash.setType(type);;
	}
	

	
}
