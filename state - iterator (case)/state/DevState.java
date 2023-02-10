package state;

import model.Dev;

public interface DevState {
	
	
	void action();
	void setState(Dev dev);

}
