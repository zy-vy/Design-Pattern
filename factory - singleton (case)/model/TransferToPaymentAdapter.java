package model;

public class TransferToPaymentAdapter extends Payment{
	
	private Transfer transfer;

	public TransferToPaymentAdapter() {
		// TODO Auto-generated constructor stub
	}

	public TransferToPaymentAdapter(Transfer transfer) {
		this.transfer = transfer;
		this.setType("Transfer");
	}

	@Override
	public void printDetail() {
//		System.out.println("$"+transfer.getPrice()+" with account number : "+transfer.getAccount());
		System.out.printf("$%.1f",transfer.getPrice());
		System.out.println(" with account number : "+transfer.getAccount());
	}
	
	@Override
	public double getPrice() {
		return transfer.getPrice();
	}

	@Override
	public void setPrice(double price) {
		transfer.setPrice((int)price);;
	}
	
	@Override
	public String getType() {
		return transfer.getType();
	}

	@Override
	public void setType(String type) {
		transfer.setType(type);;
	}
}
