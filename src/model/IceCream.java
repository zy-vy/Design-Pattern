package model;

public class IceCream {
	private String name;
	private String type, flavour;
	
	public IceCream(String name, String type, String flavour) {
		this.name = name;
		this.type = type;
		this.flavour = flavour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	
}
