import java.net.Socket;
import java.util.Scanner;

import observable.Train;
import observer.Passenger;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		int input =0;
		Train train = new Train();

		while(input!=3) {

			viewMenu(train);
			input= sc.nextInt();
			sc.nextLine();
			
			
			switch (input) {
			case 1:
				
				String name=""; 
				System.out.println("insert passenger information");
				System.out.println("===============================");
				do {
					System.out.println("Insert name [Minimal 5 characters] ");
					name = sc.nextLine();
				} while (name.length()<5);
				
				String station="";
				do {
					System.out.println("Insert station [ Poris| Grogol | Duri]");
					station = sc.nextLine();
				} while (!(station.equals("Poris") || station.equals("Grogol") || station.equals("Duri")) );
				
				System.out.println("Passanger Boarding...");
				
				Passenger passenger = new Passenger(name,station);
				train.addObserver(passenger);
//				System.out.println("add1 size "+train.listIObservers.size());
				break;
			case 2:
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("---------------------" );
				
				train.setCurrentState();
//				System.out.println(train.currentState.getStation());
				train.currentState.action();
				System.out.println("---------------------");
				System.out.println();
				if (train.currentState.getStation().equals("Duri")) train.setCurrentState();

				break;
			default:
				break;
			}
		}
	}
	
	private void viewMenu(Train train) {
		System.out.println("MBWEK TRAIN SYSTEM");
		System.out.println("==================");
		System.out.print("Current Station: ");
		System.out.println(train.getCurrentState().getStation());
		System.out.println("1. Insert Passanger");
		System.out.println("2. Train Departing");
		System.out.println("3. Exit");
		System.out.print(">>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
