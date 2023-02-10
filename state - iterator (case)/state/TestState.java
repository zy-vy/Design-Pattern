package state;

import model.Dev;

public class TestState implements DevState{

	Dev dev;
	public TestState(Dev dev) {
		this.dev = dev;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setState(Dev dev) {
		// TODO Auto-generated method stub
		dev.setCurrentState(new FinishState(dev));
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		if(dev.getJobPref().equals("Backend Dev")) {
			System.out.println("Solving Algirithm Problem");
		}
		else {
			System.out.println("Designing Application UI/UX");
		}
	}

}
