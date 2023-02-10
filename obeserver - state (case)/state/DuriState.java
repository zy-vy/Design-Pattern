package state;

import observable.Train;

public class DuriState implements TrainState{

	Train train;
	
	public DuriState(Train train) {
		// TODO Auto-generated constructor stub
		this.train = train;
	}

	

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Duri");
		train.notifyListener("Duri");
		System.out.println("All passenger are left...");
		System.out.println("Thankyou for using our service...");
		System.out.println("Train will departure back to Tangerang...");
	}

	@Override
	public String getStation() {
		// TODO Auto-generated method stub
		return "Duri";
	}

	@Override
	public void setState(Train train1) {
		// TODO Auto-generated method stub
		train1.currentState = new TgrState(train1);
	}

}
