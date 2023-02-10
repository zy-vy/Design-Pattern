package repo;

import java.util.ArrayList;
import java.util.List;

import model.Cake;

public class History {
	
	private List<Cake> cakes;
	
	private static History history= null;

	private History() {
		// TODO Auto-generated constructor stub
		cakes = new ArrayList<>();
	}
	
	public static History getInstance() {
		if (history ==null) {
			synchronized (History.class) {
				if( history == null) {
					history = new History();
				}
			}
			
		}
		
		return history;
		
	}
	
	public void addCake(Cake cake) {
		cakes.add(cake);
	}
	
	public void printHistory() {
		
		for (Cake cake : cakes) {
			
			System.out.println("name	: "+cake.getName()+" ("+cake.getType()+")");
			System.out.print("Topping	: ");
			for (String topping : cake.getTopping()) {
				System.out.print(topping+" ");
			}
			System.out.println();
			System.out.println("payment	: "+cake.getPayment().getType());
			System.out.print("Price	: ");
			cake.getPayment().printDetail();
			System.out.println("========================================================");
		}
		
	}

}
