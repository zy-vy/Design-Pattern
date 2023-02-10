package template;

import model.Reservation;
import singleton.ReservationHistory;

public abstract class ReservationTemplate {
	
	Reservation reservation;

	public final void prepareReservation(Reservation reservation) {
		// TODO Auto-generated constructor stub
		this.reservation = reservation;
		System.out.println("Prepareing Reservation for "+reservation.getUser().getName()+"...");
		prepareRoom();
		prepareFasilities();
		updateHistory();
		System.out.println("Reservation has been done...");
	}
	
	protected void prepareRoom() {
		System.out.println("Preparing "+reservation.getRoom().getName()+" room...");
	};
	
	protected abstract void prepareFasilities();
	
	protected void updateHistory() {
//		ReservationHistory.getInstance().removeReservation(reservation);
		ReservationHistory.getInstance().addPrepared(reservation);
	}

}
