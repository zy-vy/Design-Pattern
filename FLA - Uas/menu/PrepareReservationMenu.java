package menu;

import java.util.List;
import java.util.Scanner;

import model.Reservation;
import singleton.ReservationHistory;
import template.FamiliReservation;
import template.RegulerReservation;
import template.ReservationTemplate;
import template.RoyalReservation;

public class PrepareReservationMenu {
	
	Scanner sc = new Scanner(System.in);

	private ReservationHistory history;

	public PrepareReservationMenu() {
		// TODO Auto-generated constructor stub
		history = ReservationHistory.getInstance();
		System.out.println("-------------------");
		System.out.println("Prepare Reservation");
		System.out.println("-------------------");

		showReservationList();
				
		breakPoint();
	}
	
	private void showReservationList() {
		List<Reservation> reservations = history.getAll();
		
		if (reservations.isEmpty()) {
			System.out.println("\nNo reservations yet...");
			return;
		}
		
		int index =1;
		
		for (Reservation reservation : reservations) {
			System.out.println(index++ +". "+reservation.getUser().getName()+ ", "+reservation.getRoom().getName()+" Room, "+reservation.getPrice()) ;
		}
		
		int input =0;
		
		while (input <=0 || input >reservations.size()) {
			System.out.println("input index [1-"+reservations.size()+"]");
			System.out.print(">>");
			input= sc.nextInt();
			sc.nextLine();
		}
		
		Reservation reservation = history.get(input);
		
		prepareReservation(reservation);
		
	}
	
	public void prepareReservation(Reservation reservation) {
		ReservationTemplate template;
		switch (reservation.getRoom().getName()) {
		case "Reguler":
			template = new RegulerReservation();
			template.prepareReservation(reservation);
			break;
		case "Family":
			template = new FamiliReservation();
			template.prepareReservation(reservation);
			break;
		case "Royal":
			template = new RoyalReservation();
			template.prepareReservation(reservation);
			break;
		default:
			break;
		}
	}
	
	private void breakPoint() {
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}
}
