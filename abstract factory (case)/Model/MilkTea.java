package Model;

public class MilkTea extends Tea {
	
	private String milk;

	
	

	public MilkTea(String leaf, String milk) {
		super(leaf);
		this.milk = milk;
		// TODO Auto-generated constructor stub
	}


	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}
	
	

}
