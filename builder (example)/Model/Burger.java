package Model;

public abstract class Burger implements Cloneable {
	
	private int price;
	
	private String bread;
	
	private String meat;
	
	private Boolean hasCucumber;
	
	private Boolean hasEgg;
	
	private Boolean hasTomato;
	
	private Boolean hasOnion;
	
	private Boolean hasLettuce;

	public Burger() {
		
	}
//	public Burger(int price, String bread, String meat, Boolean hasCucumber, Boolean hasEgg, Boolean hasTomato,
//			Boolean hasOnion, Boolean hasLettuce) {
//		super();
//		this.price = price;
//		this.bread = bread;
//		this.meat = meat;
//		this.hasCucumber = hasCucumber;
//		this.hasEgg = hasEgg;
//		this.hasTomato = hasTomato;
//		this.hasOnion = hasOnion;
//		this.hasLettuce = hasLettuce;
//	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public Boolean getHasCucumber() {
		return hasCucumber;
	}

	public void setHasCucumber(Boolean hasCucumber) {
		this.hasCucumber = hasCucumber;
	}

	public Boolean getHasEgg() {
		return hasEgg;
	}

	public void setHasEgg(Boolean hasEgg) {
		this.hasEgg = hasEgg;
	}

	public Boolean getHasTomato() {
		return hasTomato;
	}

	public void setHasTomato(Boolean hasTomato) {
		this.hasTomato = hasTomato;
	}

	public Boolean getHasOnion() {
		return hasOnion;
	}

	public void setHasOnion(Boolean hasOnion) {
		this.hasOnion = hasOnion;
	}

	public Boolean getHasLettuce() {
		return hasLettuce;
	}

	public void setHasLettuce(Boolean hasLettuce) {
		this.hasLettuce = hasLettuce;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
		

}
