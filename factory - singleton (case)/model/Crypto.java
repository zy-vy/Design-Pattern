package model;

import java.util.Random;

public class Crypto {
	
	private String type;
	
	private double price;
	
	private String address;

	public Crypto() {
		// TODO Auto-generated constructor stub
	}

	public Crypto( int price) {
		this.type = "Crypto";
		this.price = (double)price /2;
		this.address = generate();
	}

	private String generate() {
		String str = "qwertyuiopasdfghjklzxcvbnm1234568790";
		String address ="0x";
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			address+= str.charAt(rand.nextInt(36));
		}
		
		return address;
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
