
public class TransferToCashAdapter extends Cash {

	private Transfer transfer;
	
	public TransferToCashAdapter(Transfer transfer) {
		// TODO Auto-generated constructor stub
		this.transfer=transfer;
	}

	@Override
	public double getRate() {
		return transfer.getRate();
	}
}
