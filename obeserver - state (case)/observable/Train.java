package observable;
import java.util.ArrayList;
import java.util.List;

import observer.IObserver;
import state.TgrState;
import state.TrainState;

public class Train implements ISubject{
	
	String name;
	public TrainState currentState;
	public List<IObserver> listIObservers;
	

	public Train() {
		listIObservers = new ArrayList<>();
		this.currentState = new TgrState(this);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public TrainState getCurrentState() {
		return currentState;
	}



	public void setCurrentState() {
//		System.out.println("setcurrentstate size "+listIObservers.size());
		currentState.setState(this);
	}



	@Override
	public void addObserver(IObserver observer) {
		// TODO Auto-generated method stub
//		System.out.println("add obs");
		listIObservers.add(observer);
	}



	@Override
	public void removeObserver(IObserver observer) {
		// TODO Auto-generated method stub
		listIObservers.remove(observer);
		
	}



	@Override
	public void notifyListener(String msg) {
		// TODO Auto-generated method stub
		listIObservers.forEach(observer -> {
//			System.out.println("update");
			observer.update(msg);
		});
	}
	
	

}
