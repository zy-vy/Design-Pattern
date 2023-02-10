package model;

import java.util.List;

public class Cake {
	
	private String type;
	
	private String name;
	
	private String softness;
	
	private List<String> topping;
	
	private int price;
	
	private Payment payment;

	public Cake() {
		// TODO Auto-generated constructor stub
	}

	public Cake(String type, String name, String softness, List<String> topping, int price, Payment payment) {
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.topping = topping;
		this.price = price;
		this.payment = payment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoftness() {
		return softness;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}

	public List<String> getTopping() {
		return topping;
	}

	public void setTopping(List<String> topping) {
		this.topping = topping;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	

}
