
public class CryptoToCashAdapter extends Cash {
	
	private Crypto crypto;

	public CryptoToCashAdapter(Crypto crypto) {
		this.crypto = crypto;
	}
	
	@Override
	public double getRate() {	
		return crypto.getRate();
	}
	
}
