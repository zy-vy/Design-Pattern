package model;

import java.util.Scanner;

import state.GenerateIceCreamState;
import state.IceCreamReadyState;
import state.IdleState;
import state.SelectingIceCreamState;
import state.State;

public class IceCreamMachine {
	private State ready, idle, generating, selecting;
	
	private State currentState;
	
	private IceCream iceCream;
	private String type;
	
	public IceCreamMachine() {
		ready = new IceCreamReadyState(this);
		idle=  new IdleState(this);
		generating = new GenerateIceCreamState(this);
		selecting = new SelectingIceCreamState(this);
		currentState = idle;
	}
	
	public void insertMoney() {
		currentState.turnMoney();
	}
	
	public void choosingIceCream() {
		currentState.pickingIceCream();
	}
	
	public void generateIceCream() {
		currentState.generateIceCream();
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public IceCream takeIceCream() {
		return currentState.takeIceCream();
	}
	
	
	public State getReady() {
		return ready;
	}

	public State getIdle() {
		return idle;
	}

	public State getGenerating() {
		return generating;
	}

	public State getSelecting() {
		return selecting;
	}

	public State getCurrentState() {
		return currentState;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public IceCream getIceCream() {
		return iceCream;
	}
	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
}
