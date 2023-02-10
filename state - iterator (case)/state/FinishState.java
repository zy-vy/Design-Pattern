package state;

import model.Dev;

public class FinishState implements DevState{

	Dev dev;
	public FinishState(Dev c) {
		// TODO Auto-generated constructor stub
		this.dev =dev;
	}

	@Override
	public void setState(Dev dev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Applicant SUccessfully Saved");
	}
	

}
