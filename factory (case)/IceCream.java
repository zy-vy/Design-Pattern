package creational.topposhop;

public abstract class IceCream {
	
	private String flavour;
	private String type;

	public IceCream(String flavour, String type) {
		
		this.flavour = flavour;
		this.type = type;
		// TODO Auto-generated constructor stub
	}	
	
	public abstract void printDetail(); 

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
