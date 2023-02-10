import java.util.Random;

public class Crypto {

	private double rate;
	
	private String account;
	
	public Crypto() {
		// TODO Auto-generated constructor stub
		this.rate = 0.5;
		setAccount();
	}

	public double getRate() {
		// TODO Auto-generated method stub
		return rate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount() {
		Random rand = new Random();
		
		for(int i =0;i<10;i++)
		{
			
			this.account += rand.nextInt(9) ;
		}
	}	
	


}
