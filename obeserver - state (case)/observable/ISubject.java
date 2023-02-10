package observable;

import observer.IObserver;

public interface ISubject {
	
	void addObserver(IObserver observer);
	
	void removeObserver(IObserver observer);
	
	void notifyListener(String msg);
	
}
