package state;

import observable.Train;

public class GrogolState implements TrainState {

	
	Train train; 
	
	public GrogolState(Train train) {
		// TODO Auto-generated constructor stub
		this.train = train;
	}


	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Grogol");
		train.notifyListener("Grogol");
		System.out.println("Next station is : Duri");
		
	}

	@Override
	public String getStation() {
		// TODO Auto-generated method stub
		return "Grogol";
	}

	@Override
	public void setState(Train train1) {
		// TODO Auto-generated method stub
		train1.currentState= new DuriState(train1);

	}

}
