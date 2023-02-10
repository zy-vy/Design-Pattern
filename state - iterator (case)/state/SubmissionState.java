package state;

import model.Dev;

public class SubmissionState implements DevState{

	public SubmissionState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setState(Dev dev) {
		// TODO Auto-generated method stub
		dev.setCurrentState(new InterviewState());
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Going through paper work");
	}
	
	

}
