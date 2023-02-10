package state;

import observable.Train;

public interface TrainState {
	
	String getStation();
	
	void setState(Train train1);
	
	void action();
}
