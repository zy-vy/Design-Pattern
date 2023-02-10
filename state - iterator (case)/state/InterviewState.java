package state;

import model.Dev;

public class InterviewState implements DevState{

	public InterviewState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setState(Dev dev) {
		// TODO Auto-generated method stub
		dev.setCurrentState(new TestState(dev));
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Ongoing interview");
	}

}
