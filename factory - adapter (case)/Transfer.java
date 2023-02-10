import java.util.Random;

public class Transfer  {
	
	private double rate;
	
	private String account;
	
	public Transfer() {
		
		// TODO Auto-generated constructor stub
		this.rate = 1.1;
	}
	
	public double getRate() {
		// TODO Auto-generated method stub
		return rate;
	}
	
	public String getAccount() {
		return this.account;
	}
		
	public void setAccount() {
		Random rand = new Random();
		
		for(int i =0;i<10;i++)
		{
			
			this.account += rand.nextInt(9) ;
		}
	}

	
	
}
