package model;

public class Cash {
	
	private int price;

	private String type;

	public Cash(int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
		this.type="Cash";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
