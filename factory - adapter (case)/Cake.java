
public class Cake {

	private String name;
	
	private String type;
	
	private String softness;
	
	private String toping;
	
	private Price price;
	
	private String paymentMethod;
	
	public Cake() {
		// TODO Auto-generated constructor stub
	}

	public Cake(String name, String type, String softness, String toping, Price price, String paymentMethod) {
		super();
		this.name = name;
		this.type = type;
		this.softness = softness;
		this.toping = toping;
		this.price = price;
		this.paymentMethod = paymentMethod;
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

	public String getSoftness() {
		return softness;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}

	public String getToping() {
		return toping;
	}

	public void setToping(String toping) {
		this.toping = toping;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	

}
