package model;

import state.DevState;
import state.SubmissionState;

public class Dev {

	String code;
	String name;
	int exp;
	String jobPref;
	DevState currentState;
	
	public Dev(String code, String name, int exp, String jobPref) {
		this.code = code;
		this.name = name;
		this.exp = exp;
		this.jobPref = jobPref;
		this.currentState = new SubmissionState();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getJobPref() {
		return jobPref;
	}

	public void setJobPref(String jobPref) {
		this.jobPref = jobPref;
	}

	public DevState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(DevState currentState) {
		this.currentState = currentState;
	}
	
	
	

}
