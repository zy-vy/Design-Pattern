package state;

import observable.Train;

public class PorisState implements TrainState {
	
	Train train;

	public PorisState(Train train) {
		// TODO Auto-generated constructor stub
		this.train = train;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Poris");
//		System.out.println("poris "+train.listIObservers.size());
		train.notifyListener("Poris");
		System.out.println("Next station is : Grogol");
	}

	@Override
	public String getStation() {
		// TODO Auto-generated method stub
		return "Poris";
	}

	@Override
	public void setState(Train train1) {
		// TODO Auto-generated method stub
		train1.currentState=new GrogolState(train1);

	}

}
