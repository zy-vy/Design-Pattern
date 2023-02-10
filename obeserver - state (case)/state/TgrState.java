package state;

import observable.Train;

public class TgrState implements TrainState{
	
	Train train;

	public TgrState(Train train ) {
		// TODO Auto-generated constructor stub
		this.train = train;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getStation() {
		// TODO Auto-generated method stub
		return "Tangerang";
	}

	@Override
	public void setState(Train train1) {
		// TODO Auto-generated method stub
//		System.out.println("tgr "+train.listIObservers.size());

		train1.currentState=  new PorisState(train1);

	}

}
