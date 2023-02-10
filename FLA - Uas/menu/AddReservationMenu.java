package menu;

import java.util.Scanner;

import model.Reservation;
import model.User;
import strategy.FamilyRoom;
import strategy.RegulerRoom;
import strategy.RoyalRoom;

public class AddReservationMenu {

	Scanner sc = new Scanner(System.in);
	String name ="", email ="", type =""; 

	public AddReservationMenu() {
		// TODO Auto-generated constructor stub
		
		System.out.println("-------------------");
		System.out.println("Add new Reservation");
		System.out.println("-------------------");

		newReservationForm();
		
	}
	
	private void newReservationForm() {
		
		while (name.isEmpty()) {
			System.out.println("Please input your name : ");
			name = sc.nextLine();
		}
		
		while (email.isEmpty()) {
			System.out.println("Please input email form notification : ");
			email = sc.nextLine();
		}
		
		while ( !( type.equalsIgnoreCase("royal") || type.equalsIgnoreCase("family") || type.equalsIgnoreCase("reguler"))) {
			System.out.println("Choose your room type [ \"Royal\" | \"Family\" | \"Reguler\"]");
			type = sc.nextLine();
		}
		
		makeReservation();
		
		System.out.println("Success make reservation");
		breakPoint();
	}
	
	
	private void makeReservation() {
		User user = new User(name, email);
		
		if ( type.equalsIgnoreCase("royal")) {
			Reservation reservation = new Reservation(user, new RoyalRoom());
			reservation.makeReservation();
			
		}
		else if (type.equalsIgnoreCase("family") ) {
			Reservation reservation = new Reservation(user, new FamilyRoom());
			reservation.makeReservation();
		}
		else {
			Reservation reservation = new Reservation(user, new RegulerRoom());
			reservation.makeReservation();
		}
		
	}
	
	private void breakPoint() {
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}

}
