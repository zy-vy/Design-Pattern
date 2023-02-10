package model;

public class Payment {
	
	private double price; 
	
	private String type;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(double price,String type) {
		this.price = price;
		this.type= type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printDetail() {
		System.out.printf("$%.1lf",this.price);
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
