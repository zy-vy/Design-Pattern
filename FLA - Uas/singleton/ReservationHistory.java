package singleton;

import java.util.ArrayList;
import java.util.List;

import model.Reservation;

public class ReservationHistory{

	static ReservationHistory instance ;
	
	List<Reservation> reservations;
	List<Reservation> preparedReservation;
	
	private ReservationHistory() {
		// TODO Auto-generated constructor stub
		reservations = new ArrayList<>();
		preparedReservation = new ArrayList<>();
	}
	
	public static ReservationHistory getInstance () {
		if (instance==null) {
			instance = new ReservationHistory();
		}
		return instance;
	}
	
	public void addReservation(Reservation reservation) {
		reservations.add( reservation);
	}
	
	public Reservation get(int index) {
		index-=1;
		return reservations.get(index);
	}
	
	public List<Reservation> getAll(){
		return reservations;
	}
	
	public void removeReservation(Reservation reservation) {
		reservations.remove(reservation);
	}
	
	public void addPrepared(Reservation reservation){
		preparedReservation.add(reservation);
	}
	
	public List<Reservation> getAllPreparedReservations(){
		return preparedReservation;
	}
	
	

}
