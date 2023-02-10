package creational.topposhop;

import java.util.ArrayList;

public class History {

	private ArrayList<IceCream> iceCreamList;
	
	private static History history =null;
	
	private History() {
		iceCreamList = new ArrayList<IceCream>();
		// TODO Auto-generated constructor stub
				
	}
	
	public static History getHistory() {
		
		if (history==null) {
			synchronized (History.class) {
				if (history == null) {
					history = new History();
				}
			}
		}
				
		return history;
	}
	
	public void addHistory (IceCream iceCream) {
		iceCreamList.add(iceCream);
	}
	
	public void printHistory() {
		System.out.println("History of sold ice cream");

		int count=1;
		for (IceCream iceCream : iceCreamList) {
			System.out.print(count+". ");
			iceCream.printDetail();
			count+=1;
			
		}
	}

}
