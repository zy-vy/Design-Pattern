package model;

import java.util.Random;

public class Transfer {
	
	private double price;
	
	private String type;
	
	private String account;

	public Transfer() {
		// TODO Auto-generated constructor stub
	}

	public Transfer(int  price) {
		this.price = (double) price * 1.1;
		this.account = generate();
		this.type="Transfer";
	}
	
	private String generate() {
		String str ="";
		Random rand = new Random();
		for (int i=0;i<10;i++) {
			str += rand.nextInt(10);
			
		}	
		return str;			
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
