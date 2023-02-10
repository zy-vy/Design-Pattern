package menu;

import java.util.List;
import java.util.Scanner;

import facade.EmailService;
import facade.ReportService;
import model.Email;
import model.Reservation;
import singleton.ReservationHistory;

public class ManageReservationMenu {
	
	Scanner sc = new Scanner(System.in);

	ReservationHistory history;
	
	ReportService reportService;
	
	EmailService emailService;
	
	public ManageReservationMenu() {
		// TODO Auto-generated constructor stub
		history = ReservationHistory.getInstance();
		reportService = new ReportService();
		emailService = new EmailService();
		
		int input =0;
		while ( input!=3) {
			System.out.println("-------------------");
			System.out.println("Manage Reservation");
			System.out.println("-------------------");
			System.out.println("1. Cancel Reservation");
			System.out.println("2. Upgrade Reservation");
			System.out.println("3. back");
			input = sc.nextInt();
			sc.nextLine();
			
			switch (input) {
			case 1:
				cancelReservation();
				breakPoint();

				break;
			case 2:
				upgradeReservation();
				breakPoint();

				break;
			
			default:
				break;
			}
		}
	}
	
	public void upgradeReservation() {
		Reservation reservation = showReservationList();
		
		if (reservation == null)return;
		
		
		reportService.data = "" + reservation.getUser().getName()+"_RESERVATION_UPGRADE";
		
		String message = "You have UPGRADE your reservation of room : "+reservation.getRoom().getName()+" Room\n"
				+ "with price : "+reservation.getRoom().getPrice();
				
		reservation.setRoom(reservation.getRoom().upgradeRoom());
		
		message += "\ninto room : " + reservation.getRoom().getName()+" Room\n";
		
		sendEmail(message,reservation.getUser().getEmail());
	}
	
	public void cancelReservation() {
		Reservation reservation = showReservationList();
		
		if (reservation == null)return;
		
		history.removeReservation(reservation);
		
		reportService.data = "" + reservation.getUser().getName()+"_RESERVATION_CANCEL";
		
		String message = "You have CANCEL your reservation of room : "+reservation.getRoom().getName()+" Room\n"
				+ "with price : "+reservation.getRoom().getPrice() +"\n";
		
		sendEmail(message,reservation.getUser().getEmail());

	}
	
	private void sendEmail(String message,String recipient) {
		Email email = emailService.newEmailTemplate();
		email.setBody(message);
		email.setAttachment(reportService.generatePDF());
		emailService.setEmail(email);
		emailService.sendEmail(recipient);
	}

	private Reservation showReservationList() {
		List<Reservation> reservations = history.getAll();
		
		if (reservations.isEmpty()) {
			System.out.println("\nNo reservations yet...");
			return null;
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
		return reservation;
	}

	private void breakPoint() {
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}
	
}
