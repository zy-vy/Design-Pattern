package iterator;

import java.util.List;

public class DevIterator<T> implements Iterator<T>{

	private int size, currentIndex;
	private List<T> devs;
	
	public DevIterator(List<T> list , int size) {
		// TODO Auto-generated constructor stub
		devs = list;
		
		currentIndex = 0;
		this.size=size;
	}
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentIndex<size;
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			
			return  devs.get(currentIndex++);
		}
		return null;
	}

}
